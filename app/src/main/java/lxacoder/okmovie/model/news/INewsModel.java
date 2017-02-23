package lxacoder.okmovie.model.news;

import lxacoder.okmovie.beans.NewsListBean;

/**
 * Created by lxacoder on 2016/10/4.
 * email:lxacoder@gmail.com
 * github:https://github.com/lxacoder
 */

public interface INewsModel {
    void loadNews(int pageIndex,OnLoadNewsListListener listener);

    interface OnLoadNewsListListener{
        void onSuccess(NewsListBean newsList);
        void onFailuer(Throwable e);
    }
}
