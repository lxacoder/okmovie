package lxacoder.okmovie.model.rank.impl;

import lxacoder.okmovie.model.rank.IRankListModel;
import lxacoder.okmovie.model.rank.bean.RankDetailListBean;
import lxacoder.okmovie.network.RetrofitSingleton;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by lxacoder on 2016/10/3.
 * email:lxacoder@gmail.com
 * github:https://github.com/lxacoder
 */

public class RankListModelImpl implements IRankListModel {

    OnLoadRankListListener mListener;
    RetrofitSingleton mSingleton = RetrofitSingleton.getInstance();
    @Override
    public void loadData(int pageIndex, int id, OnLoadRankListListener listener) {
        this.mListener = listener;
        mSingleton.getRankListDetail(id,pageIndex)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(mRankListObserver);
    }

    private Observer mRankListObserver = new Observer<RankDetailListBean>(){
        @Override
        public void onCompleted() {

        }

        @Override
        public void onError(Throwable e) {
            mListener.onFailure(e);
        }

        @Override
        public void onNext(RankDetailListBean rankDetailListBean) {
            mListener.onSuccess(rankDetailListBean);
        }
    };
}
