package lxacoder.okmovie.model.moviedetail;

import lxacoder.okmovie.model.moviedetail.bean.MovieDetailBean;

/**
 * Created by lxacoder on 2016/10/2.
 * email:lxacoder@gmail.com
 * github:https://github.com/lxacoder
 */

public interface IMovieDetailModel {
    void loadDetail(String id,OnloadDetailCompleteListenner listenner);

    interface OnloadDetailCompleteListenner{
        void onSuccess(MovieDetailBean bean);
        void onFailure(Throwable e);
    }
}
