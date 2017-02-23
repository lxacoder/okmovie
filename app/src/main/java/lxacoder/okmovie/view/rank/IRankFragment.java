package lxacoder.okmovie.view.rank;

import lxacoder.okmovie.model.rank.bean.RankContentBean;
import lxacoder.okmovie.model.rank.bean.RankHeaderBean;

/**
 * Created by lxacoder on 2016/9/30.
 * email:lxacoder@gmail.com
 * github:https://github.com/lxacoder
 */

public interface IRankFragment {
    void showProgress();
    void hideProgress();

    void setHeader(RankHeaderBean bean);

    void setContent(RankContentBean bean);
}
