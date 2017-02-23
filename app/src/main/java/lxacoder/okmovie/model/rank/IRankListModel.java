package lxacoder.okmovie.model.rank;

import lxacoder.okmovie.model.rank.bean.RankDetailListBean;

/**
 * Created by lxacoder on 2016/10/3.
 * email:lxacoder@gmail.com
 * github:https://github.com/lxacoder
 */

public interface IRankListModel {
    void loadData(int pageIndex,int id,OnLoadRankListListener listener);

    interface OnLoadRankListListener{
        void onSuccess(RankDetailListBean bean);
        void onFailure(Throwable throwable);
    }
}
