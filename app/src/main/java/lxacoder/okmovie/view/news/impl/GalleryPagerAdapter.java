package lxacoder.okmovie.view.news.impl;

import android.graphics.Bitmap;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.animation.GlideAnimation;
import com.bumptech.glide.request.target.SimpleTarget;

import java.util.ArrayList;

/**
 * Created by lxacoder on 2016/10/14.
 * email:lxacoder@gmail.com
 * github:https://github.com/lxacoder
 */

public class GalleryPagerAdapter extends PagerAdapter {

    private ArrayList<String> images;
    private SaveImageListener mListener;

    public GalleryPagerAdapter() {
    }

    public void setImages(ArrayList<String> urlImages){
        this.images = urlImages;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        final ImageView imageView = new ImageView(container.getContext());
        imageView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        container.addView(imageView);
        Glide.with(container.getContext()).load(images.get(position)).asBitmap().into(new SimpleTarget<Bitmap>() {
            @Override
            public void onResourceReady(Bitmap resource, GlideAnimation<? super Bitmap> glideAnimation) {
                imageView.setImageBitmap(resource);
                mListener.getBitmap(resource);
            }
        });
        return imageView;
    }

    @Override
    public int getCount() {
        return images.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    public void setSaveListener(SaveImageListener listener){
        this.mListener = listener;
    }

    public interface SaveImageListener{
        void getBitmap(Bitmap bitmap);
    }

}
