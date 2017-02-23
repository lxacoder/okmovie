package lxacoder.okmovie.model.rank;

import lxacoder.okmovie.model.rank.bean.RankContentBean;
import lxacoder.okmovie.model.rank.bean.RankHeaderBean;

/**
 * Created by lxacoder on 2016/10/1.
 * email:lxacoder@gmail.com
 * github:https://github.com/lxacoder
 */

public interface IRankModel {
    void loadHeader(onLoadHeaderListener listener);
    void loadContent(onLoadContentListener listener,int pageIndex);

    interface onLoadHeaderListener{
        void onLoadHeaderSuccess(RankHeaderBean bean);
        void onLoadHeaderFailure(Throwable e);
    }
    interface onLoadContentListener{
        void onLoadContentSuccess(RankContentBean bean);
        void onLoadContentFailure(Throwable e);
    }
}
