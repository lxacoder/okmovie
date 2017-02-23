package lxacoder.okmovie.model.theater;

import lxacoder.okmovie.model.theater.bean.DoubanNormalBean;
import lxacoder.okmovie.model.theater.bean.WeeklyBean;

/**
 * Created by lxacoder on 2016/9/29.
 * email:lxacoder@gmail.com
 * github:https://github.com/lxacoder
 */

public interface ITheaterModel {
    void loadInTheater(onLoadIntheaterContentFinishedListener listener);
    void loadComingSoon(onLoadComingSoonContentFinishedListener listener);
    void loadHighScore(onLoadHighScoreContentFinishedListener listener);

    interface onLoadIntheaterContentFinishedListener{
        void onSuccess(DoubanNormalBean doubanNormalBean);
        void onFailure(Throwable e);
    }
    interface onLoadComingSoonContentFinishedListener{
        void onSuccess(DoubanNormalBean doubanNormalBean);
        void onFailure(Throwable e);
    }
    interface onLoadHighScoreContentFinishedListener{
        void onSuccess(WeeklyBean weeklyBean);
        void onFailure(Throwable e);
    }
}
