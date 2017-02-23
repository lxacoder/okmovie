package lxacoder.okmovie.view.mine.impl;


import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Switch;

import butterknife.BindView;
import butterknife.ButterKnife;
import lxacoder.okmovie.R;
import lxacoder.okmovie.config.CommonConfig;

/**
 * A simple {@link Fragment} subclass.
 */
public class MineFragmentImpl extends Fragment implements View.OnClickListener {

    private static final String TAG = "MineFragmentImpl";

    @BindView(R.id.switcher)
    Switch mNightModeSwitch;
    @BindView(R.id.shareContainer)
    LinearLayout mShare;
    private Context mContext;

    public MineFragmentImpl() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View mView = inflater.inflate(R.layout.fragment_mine,container,false);
        ButterKnife.bind(this,mView);
        mContext = getActivity();
        init();
        return mView;
    }

    private void init(){
        if (CommonConfig.isNightMode(mContext)){
            mNightModeSwitch.setChecked(true);
        }else {
            mNightModeSwitch.setChecked(false);
        }
        mNightModeSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    CommonConfig.setNightMode(mContext,true);
                    getActivity().recreate();
                }
                else {
                    CommonConfig.setNightMode(mContext,false);
                    getActivity().recreate();
                }
            }
        });
        mShare.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id){
            case R.id.shareContainer:
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_SUBJECT, "Share");
                intent.putExtra(Intent.EXTRA_TEXT, "http://ab.baicizhan.com/170157/daka/weixin?today=46&days=44&from=singlemessage&isappinstalled=0");
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                Intent chooseIntent = Intent.createChooser(intent,"分享okMovie给朋友");
                if (chooseIntent.resolveActivity(getActivity().getPackageManager())!=null){
                    startActivity(intent);
                }
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"onDestroy");
    }
}
