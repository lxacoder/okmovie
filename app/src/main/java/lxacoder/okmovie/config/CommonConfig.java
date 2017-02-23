package lxacoder.okmovie.config;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import lxacoder.okmovie.app.BaseApplication;

/**
 * Created by lxacoder on 2016/10/10.
 * email:lxacoder@gmail.com
 * github:https://github.com/lxacoder
 */

public class CommonConfig {

    public static boolean isNightMode(Context mContext){
        SharedPreferences mSp = PreferenceManager.getDefaultSharedPreferences(mContext);
        return mSp.getBoolean("isNight",false);
    }
    public static void setNightMode(Context mContext,boolean isNightMode){
        SharedPreferences mSp = PreferenceManager.getDefaultSharedPreferences(mContext);
        mSp.edit().putBoolean("isNight",isNightMode).apply();
    }
}
