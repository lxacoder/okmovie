package lxacoder.okmovie.presenter.theater.impl;

import lxacoder.okmovie.model.theater.bean.DoubanNormalBean;
import lxacoder.okmovie.model.theater.bean.WeeklyBean;
import lxacoder.okmovie.model.theater.ITheaterModel;
import lxacoder.okmovie.model.theater.impl.TheaterModelImpl;
import lxacoder.okmovie.presenter.theater.ITheaterPresenter;
import lxacoder.okmovie.view.theater.ITheaterFragment;
import lxacoder.okmovie.view.theater.impl.TheaterBaseFragment;

/**
 * Created by lxacoder on 2016/9/29.
 * email:lxacoder@gmail.com
 * github:https://github.com/lxacoder
 */

public class TheaterPresenterImpl implements ITheaterPresenter,
        ITheaterModel.onLoadComingSoonContentFinishedListener,
        ITheaterModel.onLoadIntheaterContentFinishedListener,
        ITheaterModel.onLoadHighScoreContentFinishedListener{

    private ITheaterFragment mITheaterFragment;
    private ITheaterModel mITheaterModel;

    public TheaterPresenterImpl(ITheaterFragment mITheaterFragment){
        this.mITheaterFragment = mITheaterFragment;
        mITheaterModel = new TheaterModelImpl();
    }

    @Override
    public void loadContent(int type) {
        switch (type){
            case TheaterBaseFragment.INTHEATER:
                mITheaterModel.loadInTheater(this);
                mITheaterFragment.showProgress();
                break;
            case TheaterBaseFragment.COMINGSOON:
                mITheaterModel.loadComingSoon(this);
                mITheaterFragment.showProgress();
                break;
            case TheaterBaseFragment.HIGHSCORE:
                mITheaterModel.loadHighScore(this);
                mITheaterFragment.showProgress();
                break;
        }
    }

    @Override
    public void onSuccess(DoubanNormalBean doubanNormalBean) {
        mITheaterFragment.setInteaterAndComingSoonContent(doubanNormalBean);
        mITheaterFragment.hideProgress();
    }

    @Override
    public void onSuccess(WeeklyBean weeklyBean) {
        mITheaterFragment.setHighSocreContent(weeklyBean);
        mITheaterFragment.hideProgress();
    }

    @Override
    public void onFailure(Throwable e) {

    }
}
