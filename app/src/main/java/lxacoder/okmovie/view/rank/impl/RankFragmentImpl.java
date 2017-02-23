package lxacoder.okmovie.view.rank.impl;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.BindView;
import butterknife.ButterKnife;
import lxacoder.okmovie.R;
import lxacoder.okmovie.config.CommonConfig;
import lxacoder.okmovie.config.RecyclerViewDecoration;
import lxacoder.okmovie.model.rank.bean.RankContentBean;
import lxacoder.okmovie.model.rank.bean.RankHeaderBean;
import lxacoder.okmovie.presenter.rank.IRankFragmentPrensenter;
import lxacoder.okmovie.presenter.rank.impl.RankFragmentRankPresenterImpl;
import lxacoder.okmovie.view.rank.IRankFragment;
import lxacoder.okmovie.view.rank.adapter.RankRvAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class RankFragmentImpl extends Fragment implements IRankFragment, RankRvAdapter.OnItemClickListener {
    private static final String TAG = "RankFragmentImpl";

    public static final int HEADER = 0;
    public static final int RANK100 = 1;
    public static final int CONTENT = 2;
    private Context mContext;

    @BindView(R.id.rank_rv)
    RecyclerView mRecyclerView;

    RankHeaderBean mHeaderBean = new RankHeaderBean();
    RankContentBean mContentBean = new RankContentBean();
    RankRvAdapter mAdapter;

    IRankFragmentPrensenter mPrensenter;
    public RankFragmentImpl() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPrensenter = new RankFragmentRankPresenterImpl(this);
        mPrensenter.loadHeader();
        mPrensenter.loadContent(1);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mContext = getActivity();
        View view = inflater.inflate(R.layout.fragment_rank,container,false);
        ButterKnife.bind(this,view);
        mAdapter = new RankRvAdapter(mHeaderBean,mContentBean,mContext);
        mAdapter.setItemClickListender(this);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(mContext));
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.addItemDecoration(new RecyclerViewDecoration(mContext,1, CommonConfig.isNightMode(getActivity())));
        mRecyclerView.setAdapter(mAdapter);
        return view;
    }


    @Override
    public void showProgress() {

    }

    @Override
    public void hideProgress() {

    }

    @Override
    public void setHeader(RankHeaderBean bean) {
        this.mHeaderBean.topList = bean.topList;
        mAdapter.notifyDataSetChanged();
    }

    @Override
    public void setContent(RankContentBean bean) {
        this.mContentBean.topLists = bean.topLists;
        mAdapter.notifyDataSetChanged();
    }

    @Override
    public void onItemClick(int id) {
        Intent toListDetailIntent = new Intent(getActivity(),RankListActivity.class);
        toListDetailIntent.putExtra("listid",id);
        startActivity(toListDetailIntent);
    }
}
