package lxacoder.okmovie.presenter.rank.impl;

import android.content.Context;

import lxacoder.okmovie.model.rank.IRankModel;
import lxacoder.okmovie.model.rank.bean.RankContentBean;
import lxacoder.okmovie.model.rank.bean.RankHeaderBean;
import lxacoder.okmovie.model.rank.impl.RankModelImpl;
import lxacoder.okmovie.presenter.rank.IRankFragmentPrensenter;
import lxacoder.okmovie.view.rank.IRankFragment;

import static lxacoder.okmovie.view.rank.impl.RankFragmentImpl.CONTENT;
import static lxacoder.okmovie.view.rank.impl.RankFragmentImpl.HEADER;

/**
 * Created by lxacoder on 2016/10/1.
 * email:lxacoder@gmail.com
 * github:https://github.com/lxacoder
 */

public class RankFragmentRankPresenterImpl implements IRankFragmentPrensenter,
        IRankModel.onLoadHeaderListener
        , IRankModel.onLoadContentListener {

    public IRankFragment mIRankFragment;
    public IRankModel mIRankModel;

    public RankFragmentRankPresenterImpl(IRankFragment IRankFragment) {
        this.mIRankFragment = IRankFragment;
        this.mIRankModel = new RankModelImpl();
    }


    @Override
    public void loadHeader() {
        mIRankModel.loadHeader(this);
    }
    @Override
    public void loadContent(int pageIndex) {
        mIRankModel.loadContent(this, pageIndex);
    }


    @Override
    public void onLoadContentSuccess(RankContentBean bean) {
        mIRankFragment.setContent(bean);
    }

    @Override
    public void onLoadContentFailure(Throwable e) {

    }

    @Override
    public void onLoadHeaderSuccess(RankHeaderBean bean) {
        mIRankFragment.setHeader(bean);
    }

    @Override
    public void onLoadHeaderFailure(Throwable e) {

    }
}
