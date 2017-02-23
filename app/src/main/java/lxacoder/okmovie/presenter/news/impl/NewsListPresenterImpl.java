package lxacoder.okmovie.presenter.news.impl;

import lxacoder.okmovie.beans.NewsListBean;
import lxacoder.okmovie.model.news.INewsModel;
import lxacoder.okmovie.model.news.impl.NewsModelImpl;
import lxacoder.okmovie.presenter.news.INewsListPresenter;
import lxacoder.okmovie.view.news.INewsListFragment;

/**
 * Created by lxacoder on 2016/10/4.
 * email:lxacoder@gmail.com
 * github:https://github.com/lxacoder
 */

public class NewsListPresenterImpl implements INewsListPresenter, INewsModel.OnLoadNewsListListener {

    INewsListFragment mView;
    INewsModel mModel;
    public NewsListPresenterImpl(INewsListFragment view) {
        mView = view;
        mModel = new NewsModelImpl();
    }

    @Override
    public void loadNews(int pageIndex) {
        mModel.loadNews(pageIndex ,this);
        mView.showProgress();
    }


    @Override
    public void onSuccess(NewsListBean newsList) {
        mView.showContent(newsList);
        mView.hideProgress();
    }

    @Override
    public void onFailuer(Throwable e) {

    }
}
