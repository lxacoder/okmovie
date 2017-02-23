package lxacoder.okmovie.model.rank.impl;

import lxacoder.okmovie.model.rank.IRankModel;
import lxacoder.okmovie.model.rank.bean.RankContentBean;
import lxacoder.okmovie.model.rank.bean.RankHeaderBean;
import lxacoder.okmovie.network.RetrofitSingleton;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by lxacoder on 2016/10/1.
 * email:lxacoder@gmail.com
 * github:https://github.com/lxacoder
 */

public class RankModelImpl implements IRankModel {
    private RetrofitSingleton mRetrofitSingleton = RetrofitSingleton.getInstance();
    private onLoadHeaderListener mHeaderListener;
    private onLoadContentListener mContentListener;
    @Override
    public void loadHeader(onLoadHeaderListener listener) {
        this.mHeaderListener = listener;
        mRetrofitSingleton.getRankHeader().subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread())
                .subscribe(headerObserver);
    }

    @Override
    public void loadContent(onLoadContentListener listener,int pageIndex) {
        this.mContentListener = listener;
        mRetrofitSingleton.getRankContent(pageIndex)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(contentObserver);
    }

    public Observer contentObserver = new Observer<RankContentBean>(){

        @Override
        public void onCompleted() {

        }

        @Override
        public void onError(Throwable e) {
            mContentListener.onLoadContentFailure(e);
        }

        @Override
        public void onNext(RankContentBean rankContentBean) {
            mContentListener.onLoadContentSuccess(rankContentBean);
        }
    };

    public Observer headerObserver = new Observer<RankHeaderBean>() {
        @Override
        public void onCompleted() {

        }

        @Override
        public void onError(Throwable e) {
            mHeaderListener.onLoadHeaderFailure(e);
        }

        @Override
        public void onNext(RankHeaderBean bean) {
            mHeaderListener.onLoadHeaderSuccess(bean);
        }
    };
}
