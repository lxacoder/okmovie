package lxacoder.okmovie.network;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import lxacoder.okmovie.view.news.impl.VideoDetailActivity;


/**
 * Created by lxacoder on 2016/9/9.
 * email:lxacoder@gmail.com
 * github:https://github.com/lxacoder
 */
public class NewsDetailWebviewClient extends WebViewClient {

    public Context mContext;
    private OnLoadListener mListener;

    public NewsDetailWebviewClient(Context context, OnLoadListener listener) {
        this.mContext = context;
        this.mListener = listener;
    }

    @Override
    @TargetApi(21)
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        mListener.onLoadSuccess(url);
        return true;
    }


    public interface OnLoadListener {
        void onLoadSuccess(String url);
    }
    //这里遇到的天坑，上面那个方法已经弃用，推荐使用下面这个方法，但是下面这个方法却不会回调。
//    @Override
//    @TargetApi(21)
//    public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest url) {
//        Log.d("inshould",url.getUrl().toString());
//        return true;
//    }
}
