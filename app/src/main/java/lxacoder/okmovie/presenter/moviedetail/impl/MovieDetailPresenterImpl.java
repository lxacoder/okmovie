package lxacoder.okmovie.presenter.moviedetail.impl;

import android.view.View;

import lxacoder.okmovie.model.moviedetail.IMovieDetailModel;
import lxacoder.okmovie.model.moviedetail.bean.MovieDetailBean;
import lxacoder.okmovie.model.moviedetail.impl.MovieDetailModelImpl;
import lxacoder.okmovie.presenter.moviedetail.IMovieDetailPresenter;
import lxacoder.okmovie.view.moviedetail.IMovieDetail;

/**
 * Created by lxacoder on 2016/10/2.
 * email:lxacoder@gmail.com
 * github:https://github.com/lxacoder
 */

public class MovieDetailPresenterImpl implements IMovieDetailPresenter,IMovieDetailModel.OnloadDetailCompleteListenner{

    private IMovieDetail mIMovieDetail;

    private IMovieDetailModel mPresenter;

    public MovieDetailPresenterImpl(IMovieDetail view) {
        this.mIMovieDetail = view;
        mPresenter = new MovieDetailModelImpl();
    }

    @Override
    public void loadData(String id) {
        mPresenter.loadDetail(id,this);
    }

    @Override
    public void showError(Throwable throwable) {

    }

    @Override
    public void onSuccess(MovieDetailBean bean) {
        mIMovieDetail.showData(bean);
    }

    @Override
    public void onFailure(Throwable e) {

    }
}
