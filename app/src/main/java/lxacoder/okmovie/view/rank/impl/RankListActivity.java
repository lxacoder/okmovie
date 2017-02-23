package lxacoder.okmovie.view.rank.impl;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import butterknife.BindView;
import butterknife.ButterKnife;
import lxacoder.okmovie.R;
import lxacoder.okmovie.config.CommonConfig;
import lxacoder.okmovie.config.RecyclerViewDecoration;
import lxacoder.okmovie.model.rank.bean.RankDetailListBean;
import lxacoder.okmovie.presenter.rank.IRankListAcitivityPresenter;
import lxacoder.okmovie.presenter.rank.impl.RankListActivityPresenterImpl;
import lxacoder.okmovie.view.rank.IRankListDetailActivity;
import lxacoder.okmovie.view.rank.adapter.RankListRvAdapter;

public class RankListActivity extends AppCompatActivity implements IRankListDetailActivity {


    private static final String TAG = "RankListActivity";

    @BindView(R.id.rankListRv)
    RecyclerView mRecyclerView;

    IRankListAcitivityPresenter mPresenter;
    RankListRvAdapter adapter;
    RankDetailListBean mListBean = new RankDetailListBean();
    int pageIndex = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ranklist);
        ButterKnife.bind(this);
        Intent mIntent = getIntent();
        int newsId = mIntent.getIntExtra("listid",0);
        mPresenter = new RankListActivityPresenterImpl(this);
        mPresenter.loadData(pageIndex, newsId);
        initRecyclerView();
    }

    private void initRecyclerView() {
        adapter = new RankListRvAdapter(this, mListBean);
        mRecyclerView.addItemDecoration(new RecyclerViewDecoration(this,0, CommonConfig.isNightMode(this)));
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(adapter);
    }

    @Override
    public void showProgress() {

    }

    @Override
    public void hideProgress() {

    }

    @Override
    public void showData(RankDetailListBean listBean) {
        mListBean.movies = listBean.movies;
        mListBean.topList = listBean.topList;
        adapter.notifyDataSetChanged();
    }
}
