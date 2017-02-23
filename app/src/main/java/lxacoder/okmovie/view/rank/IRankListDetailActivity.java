package lxacoder.okmovie.view.rank;

import lxacoder.okmovie.model.rank.bean.RankDetailListBean;

/**
 * Created by lxacoder on 2016/10/3.
 * email:lxacoder@gmail.com
 * github:https://github.com/lxacoder
 */

public interface IRankListDetailActivity {
    void showProgress();
    void hideProgress();

    void showData(RankDetailListBean bean);
}
