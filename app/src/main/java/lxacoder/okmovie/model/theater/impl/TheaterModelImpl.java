package lxacoder.okmovie.model.theater.impl;

import android.util.Log;

import lxacoder.okmovie.model.theater.bean.DoubanNormalBean;
import lxacoder.okmovie.model.theater.bean.WeeklyBean;
import lxacoder.okmovie.model.theater.ITheaterModel;
import lxacoder.okmovie.network.RetrofitSingleton;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by lxacoder on 2016/9/29.
 * email:lxacoder@gmail.com
 * github:https://github.com/lxacoder
 */

public class TheaterModelImpl implements ITheaterModel {
    private static final String TAG="TheaterModelImpl";
    private RetrofitSingleton singleton = RetrofitSingleton.getInstance();
    private ITheaterModel.onLoadIntheaterContentFinishedListener inTheaterListener;
    private ITheaterModel.onLoadComingSoonContentFinishedListener comingSoonListener;
    private ITheaterModel.onLoadHighScoreContentFinishedListener highScoreListener;
    @Override
    public void loadInTheater(ITheaterModel.onLoadIntheaterContentFinishedListener listener) {
        this.inTheaterListener = listener;
        singleton.getTodayMovie("北京").subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(mIntheaterObserver);
    }

    @Override
    public void loadComingSoon(onLoadComingSoonContentFinishedListener listener) {
        this.comingSoonListener = listener;
        singleton.getComingSoon().subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(mComingSoonObserver);
    }

    @Override
    public void loadHighScore(onLoadHighScoreContentFinishedListener listener) {
        this.highScoreListener = listener;
        singleton.getWeekly().subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(mWeeklyBeanObserver);
    }

    private Observer<DoubanNormalBean> mIntheaterObserver = new Observer<DoubanNormalBean>() {
        @Override
        public void onCompleted() {

        }

        @Override
        public void onError(Throwable e) {
            inTheaterListener.onFailure(e);
        }

        @Override
        public void onNext(DoubanNormalBean normalBean) {
            inTheaterListener.onSuccess(normalBean);
        }
    };
    private Observer<DoubanNormalBean> mComingSoonObserver = new Observer<DoubanNormalBean>() {
        @Override
        public void onCompleted() {

        }

        @Override
        public void onError(Throwable e) {
            comingSoonListener.onFailure(e);
        }

        @Override
        public void onNext(DoubanNormalBean normalBean) {
            comingSoonListener.onSuccess(normalBean);
        }
    };
    private Observer<WeeklyBean> mWeeklyBeanObserver = new Observer<WeeklyBean>() {
        @Override
        public void onCompleted() {

        }

        @Override
        public void onError(Throwable e) {
            highScoreListener.onFailure(e);
            Log.d(TAG,"error");
            e.printStackTrace();
        }

        @Override
        public void onNext(WeeklyBean normalBean) {
            highScoreListener.onSuccess(normalBean);
        }
    };
}
