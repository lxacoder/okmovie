package lxacoder.okmovie.model.news.impl;


import lxacoder.okmovie.beans.NewsListBean;
import lxacoder.okmovie.model.news.INewsModel;
import lxacoder.okmovie.network.RetrofitSingleton;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by lxacoder on 2016/10/4.
 * email:lxacoder@gmail.com
 * github:https://github.com/lxacoder
 */

public class NewsModelImpl implements INewsModel {

    RetrofitSingleton mSingleton = RetrofitSingleton.getInstance();
    OnLoadNewsListListener mListener;

    @Override
    public void loadNews(int pageIndex,OnLoadNewsListListener listener) {
        this.mListener = listener;
        mSingleton.getNews(pageIndex).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribe(mNewsListBeanObserver);
    }

    private Observer<NewsListBean> mNewsListBeanObserver = new rx.Observer<NewsListBean>() {
        @Override
        public void onCompleted() {

        }

        @Override
        public void onError(Throwable e) {
            mListener.onFailuer(e);
        }

        @Override
        public void onNext(NewsListBean newsListBean) {
            mListener.onSuccess(newsListBean);
        }
    };
}
