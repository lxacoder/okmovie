package lxacoder.okmovie.view.news.impl;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import lxacoder.okmovie.R;

public class NewsImageAcitivity extends AppCompatActivity implements ViewPager.OnPageChangeListener, GalleryPagerAdapter.SaveImageListener, View.OnClickListener {

    private static final String TAG = "NewsImageAcitivity";

    @BindView(R.id.count)
    TextView mCount;
    @BindView(R.id.share)
    ImageView mShare;
    @BindView(R.id.gallery)
    ViewPager mGallery;
    @BindView(R.id.download)
    ImageView mDownload;

    private Bitmap mCurrentImage;
    private int currentImageNum;
    private int totalImageNum;
    private ArrayList<String> iamgeURLs;
    GalleryPagerAdapter mPagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.images_gallery);
        ButterKnife.bind(this);
        Intent intent = getIntent();
        currentImageNum = intent.getIntExtra("current",0);
        totalImageNum = intent.getIntExtra("total",0);
        iamgeURLs = intent.getStringArrayListExtra("images");
        mPagerAdapter = new GalleryPagerAdapter();
        mPagerAdapter.setImages(iamgeURLs);
        mPagerAdapter.setSaveListener(this);
        mGallery.setAdapter(mPagerAdapter);
        mGallery.addOnPageChangeListener(this);
        init();
    }
    private void init(){
        StringBuilder builder = new StringBuilder();
        builder.append(currentImageNum+1).append("/").append(totalImageNum);
        mCount.setText(builder.toString());
        mDownload.setOnClickListener(this);
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append(position+1).append("/").append(totalImageNum);
        mCount.setText(builder.toString());
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    @Override
    public void getBitmap(Bitmap bitmap) {
        this.mCurrentImage = bitmap;
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id){
            case R.id.download:
                if (ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE)
                        != PackageManager.PERMISSION_GRANTED){
                    ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},1);
                }else {
                    saveImage();
                }
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch (requestCode){
            case 1:
                if (grantResults[0]==PackageManager.PERMISSION_GRANTED){
                    saveImage();
                }
        }
    }

    private void saveImage(){
        File file = new File(Environment.getExternalStorageDirectory(),"okMovie");
        Log.d(TAG,file.getAbsolutePath());
        if (!file.exists()){
            file.mkdir();
            Log.d(TAG,"MAEK");
        }
        String imageName = System.currentTimeMillis() + ".jpg";
        File image = new File(file,imageName);
        try {
            FileOutputStream fos = new FileOutputStream(image);
            mCurrentImage.compress(Bitmap.CompressFormat.JPEG,100,fos);
            fos.flush();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            MediaStore.Images.Media.insertImage(getContentResolver(),image.getAbsolutePath(),imageName,null);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        sendBroadcast(new Intent(Intent.ACTION_MEDIA_SCANNER_SCAN_FILE,Uri.parse("file://"+image.getAbsolutePath())));
        Toast.makeText(this,"图片已经保存到内存",Toast.LENGTH_SHORT).show();
    }
}
