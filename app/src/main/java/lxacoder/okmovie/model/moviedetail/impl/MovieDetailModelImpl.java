package lxacoder.okmovie.model.moviedetail.impl;

import lxacoder.okmovie.model.moviedetail.IMovieDetailModel;
import lxacoder.okmovie.model.moviedetail.bean.MovieDetailBean;
import lxacoder.okmovie.network.RetrofitSingleton;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by lxacoder on 2016/10/2.
 * email:lxacoder@gmail.com
 * github:https://github.com/lxacoder
 */

public class MovieDetailModelImpl implements IMovieDetailModel {

    RetrofitSingleton mRetrofitSingleton = RetrofitSingleton.getInstance();
    OnloadDetailCompleteListenner mCompleteListenner;
    @Override
    public void loadDetail(String id,OnloadDetailCompleteListenner listenner) {
        this.mCompleteListenner = listenner;
        mRetrofitSingleton.getMovieDetail(id)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(mBeanObserver);

    }

    Observer<MovieDetailBean> mBeanObserver = new Observer<MovieDetailBean>() {
        @Override
        public void onCompleted() {

        }

        @Override
        public void onError(Throwable e) {
            mCompleteListenner.onFailure(e);
        }

        @Override
        public void onNext(MovieDetailBean movieDetailBean) {
            mCompleteListenner.onSuccess(movieDetailBean);
        }
    };
}
