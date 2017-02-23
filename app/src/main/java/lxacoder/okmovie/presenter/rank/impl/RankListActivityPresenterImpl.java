package lxacoder.okmovie.presenter.rank.impl;

import lxacoder.okmovie.model.rank.IRankListModel;
import lxacoder.okmovie.model.rank.bean.RankDetailListBean;
import lxacoder.okmovie.model.rank.impl.RankListModelImpl;
import lxacoder.okmovie.presenter.rank.IRankListAcitivityPresenter;
import lxacoder.okmovie.view.rank.IRankListDetailActivity;

/**
 * Created by lxacoder on 2016/10/3.
 * email:lxacoder@gmail.com
 * github:https://github.com/lxacoder
 */

public class RankListActivityPresenterImpl implements IRankListAcitivityPresenter, IRankListModel.OnLoadRankListListener {

    IRankListDetailActivity mView;
    IRankListModel mModel;

    public RankListActivityPresenterImpl(IRankListDetailActivity view) {
        mView = view;
        mModel = new RankListModelImpl();
    }

    @Override
    public void loadData(int pageIndex, int listId) {
        mModel.loadData(pageIndex,listId,this);
    }

    @Override
    public void onSuccess(RankDetailListBean bean) {
        mView.showData(bean);
    }

    @Override
    public void onFailure(Throwable throwable) {

    }
}
