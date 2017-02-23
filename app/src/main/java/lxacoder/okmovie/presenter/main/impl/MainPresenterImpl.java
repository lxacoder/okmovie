package lxacoder.okmovie.presenter.main.impl;

import lxacoder.okmovie.R;
import lxacoder.okmovie.presenter.main.IMainPresenter;
import lxacoder.okmovie.view.main.MainView;

/**
 * Created by lxacoder on 2016/9/29.
 * email:lxacoder@gmail.com
 * github:https://github.com/lxacoder
 */

public class MainPresenterImpl implements IMainPresenter {

    public MainView mMainView;

    public MainPresenterImpl(MainView mainView) {
        this.mMainView = mainView;
    }

    @Override
    public void bottomSwitchTo(int tabId) {
        switch (tabId){
            case R.id.tab_theater:
                mMainView.switchToTheater();
                break;
            case R.id.tab_rank:
                mMainView.switchToRank();
                break;
            case R.id.tab_news:
                mMainView.switchToNews();
                break;
            case R.id.tab_me:
                mMainView.switchToMe();
                break;
            default:
        }
    }
}
