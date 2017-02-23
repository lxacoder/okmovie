package lxacoder.okmovie.view.news.impl;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.webkit.WebSettings;
import android.webkit.WebView;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import lxacoder.okmovie.R;
import lxacoder.okmovie.beans.NewsDetailBean;
import lxacoder.okmovie.config.Utils;
import lxacoder.okmovie.network.NewsDetailWebviewClient;
import lxacoder.okmovie.network.RetrofitSingleton;
import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class NewsDetailActivity extends AppCompatActivity implements NewsDetailWebviewClient.OnLoadListener {

    public WebView mWebView;

    private NewsDetailBean mNewsDetailBean = new NewsDetailBean();
    private int newsId;
    private ArrayList<String> imageURLs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newsdetail);
        mWebView = (WebView) findViewById(R.id.webview);
        mWebView.getSettings().setDefaultTextEncodingName("utf-8");
        mWebView.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.getSettings().setUseWideViewPort(true);
        mWebView.setWebViewClient(new NewsDetailWebviewClient(this,this));
        mWebView.getSettings().setSupportZoom(false);
        mWebView.setFocusable(false);
        mWebView.setFocusableInTouchMode(false);
        mWebView.requestFocus();
        Intent intent = getIntent();
        newsId = intent.getIntExtra("newsId", 0);
        getNewsDetail(newsId).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(mNewsDetailBeanObserver);

    }

    public Observable<NewsDetailBean> getNewsDetail(int newsId) {
        return RetrofitSingleton.getInstance().getNewsDetail(newsId);
    }

    private Observer<NewsDetailBean> mNewsDetailBeanObserver = new Observer<NewsDetailBean>() {
        @Override
        public void onCompleted() {

        }

        @Override
        public void onError(Throwable e) {
            e.printStackTrace();
        }

        @Override
        public void onNext(NewsDetailBean newsDetailBean) {
            mNewsDetailBean = newsDetailBean;
            mWebView.loadDataWithBaseURL("", initialHtml(mNewsDetailBean), "text/html", "utf-8", "");
          //  mWebView.loadData(initialHtml(mNewsDetailBean),"text/html","UTF-8");
            // mWebView.loadUrl("http://www.baidu.com");
        }
    };

    private String initialHtml(NewsDetailBean newsDetailBean) {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("<!DOCTYPE html>");
        localStringBuilder.append("<html>");
        localStringBuilder.append("<head>");
        localStringBuilder.append("<meta charset='utf-8'>");
        localStringBuilder.append("<title></title>");
        localStringBuilder.append("<meta name='viewport' content='width=device-width, minimum-scale=1, maximum-scale=1, user-scalable=no'>");
        localStringBuilder.append("<meta name='apple-mobile-web-app-status-bar-style' content='black'/>");
        localStringBuilder.append("<meta content='telephone=no' name='format-detection' />");
        localStringBuilder.append("<link href='file:///android_asset/style.css' rel='stylesheet' type='text/css' />");
        localStringBuilder.append("<script src='file:///android_asset/iphone.js' type='text/javascript'></script>");
        localStringBuilder.append("</head>");
        localStringBuilder.append("<body><div class=\"article\" ><div class=\"title\"><h1>");
        localStringBuilder.append(newsDetailBean.title);
        localStringBuilder.append("</h1><h3>").append(newsDetailBean.title2).append("</h3><p style=\"color:gray\">");
        localStringBuilder.append(newsDetailBean.time).append("   ").append(newsDetailBean.source);
        localStringBuilder.append("</p></div>");
        localStringBuilder.append("<div class=\"content\" style=\"overflow:hidden;word-break:break-all\">").append(newsDetailBean.content);
        if (Utils.stringIsNotNull(newsDetailBean.author))
            localStringBuilder.append("<br>").append("(作者:").append(newsDetailBean.author).append(")");
        else if (Utils.stringIsNotNull(newsDetailBean.editor))
            localStringBuilder.append("<br>").append("(编辑:").append(newsDetailBean.editor).append(")");
        localStringBuilder.append("</div></div></body></html>");
        Matcher localMatcher = Pattern.compile("<\\s*img[^<]*src\\s*=\\s*\"([^<]+jpg{1})\"[^>]*>", Pattern.CASE_INSENSITIVE).matcher(newsDetailBean.content);
        this.imageURLs = new ArrayList();
        while (localMatcher.find()) {
            this.imageURLs.add(localMatcher.group(1));
        }
        return localStringBuilder.toString().replace("<embed", "<div style=\"display:none\" ").replace("</embed>", "</div>");
    }

    @Override
    public void onLoadSuccess(String url) {
        if (url.endsWith(".mp4")){
            Intent intent = new Intent(this, VideoDetailActivity.class);
            intent.putExtra("videoUri",url);
            startActivity(intent);
        }else if (url.endsWith(".jpg")){
            int total=imageURLs.size();
            int current;
            for (current = 0;current<total;current++){
                if (url.equals(imageURLs.get(current))){
                    break;
                }
            }
            Intent intent = new Intent(this,NewsImageAcitivity.class);
            intent.putExtra("current",current);
            intent.putExtra("total",total);
            intent.putStringArrayListExtra("images",imageURLs);
            startActivity(intent);
        }
    }
}
