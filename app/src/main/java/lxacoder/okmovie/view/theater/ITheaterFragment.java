package lxacoder.okmovie.view.theater;

import lxacoder.okmovie.model.theater.bean.DoubanNormalBean;
import lxacoder.okmovie.model.theater.bean.WeeklyBean;

/**
 * Created by lxacoder on 2016/9/29.
 * email:lxacoder@gmail.com
 * github:https://github.com/lxacoder
 */

public interface ITheaterFragment {
    void showProgress();
    void hideProgress();

    void setInteaterAndComingSoonContent(DoubanNormalBean doubanNormalBean);
    void setHighSocreContent(WeeklyBean weeklyBean);
}
