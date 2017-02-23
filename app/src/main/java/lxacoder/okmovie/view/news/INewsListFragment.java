package lxacoder.okmovie.view.news;

import lxacoder.okmovie.beans.NewsListBean;

/**
 * Created by lxacoder on 2016/10/4.
 * email:lxacoder@gmail.com
 * github:https://github.com/lxacoder
 */

public interface INewsListFragment {
    void showContent(NewsListBean bean);

    void showProgress();

    void hideProgress();
}
