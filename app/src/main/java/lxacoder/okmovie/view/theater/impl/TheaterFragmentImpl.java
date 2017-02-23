package lxacoder.okmovie.view.theater.impl;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.BindView;
import butterknife.ButterKnife;
import lxacoder.okmovie.R;
import lxacoder.okmovie.view.moviedetail.impl.MovieDetailActivity;
import lxacoder.okmovie.view.theater.ItemTheaterRvAdapter;
import lxacoder.okmovie.view.theater.ItemTheaterRvAdapterHighScore;
import lxacoder.okmovie.app.BaseFragment;
import lxacoder.okmovie.model.theater.bean.DoubanNormalBean;
import lxacoder.okmovie.model.theater.bean.WeeklyBean;
import lxacoder.okmovie.presenter.theater.ITheaterPresenter;
import lxacoder.okmovie.presenter.theater.impl.TheaterPresenterImpl;
import lxacoder.okmovie.view.theater.ITheaterFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class TheaterFragmentImpl extends BaseFragment implements ITheaterFragment,SwipeRefreshLayout.OnRefreshListener, ItemTheaterRvAdapter.OnItemClickListener {
    private static final String TAG = "TheaterFragmentImpl";

    @BindView(R.id.theateRv)
    RecyclerView mRecyclerView;
    @BindView(R.id.swipe)
    SwipeRefreshLayout mSwipeRefreshLayout;

    ITheaterPresenter mITheaterPresenter;

    private DoubanNormalBean mDoubanNormalBean = new DoubanNormalBean();
    private WeeklyBean mWeeklyBean = new WeeklyBean();
    private ItemTheaterRvAdapter mItemTheaterRvAdapter;
    private ItemTheaterRvAdapterHighScore mItemTheaterRvAdapterHighScore;
    public int type = TheaterBaseFragment.INTHEATER;

    public static TheaterFragmentImpl newInstance(int type) {
        Bundle args = new Bundle();
        args.putInt("type", type);
        TheaterFragmentImpl theaterFragment = new TheaterFragmentImpl();
        theaterFragment.setArguments(args);
        return theaterFragment;
    }

    public TheaterFragmentImpl() {

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        type = getArguments().getInt("type");
        mITheaterPresenter = new TheaterPresenterImpl(this);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View fragment = inflater.inflate(R.layout.fragment_item_theater, container, false);
        ButterKnife.bind(this, fragment);
        mITheaterPresenter.loadContent(type);
        mSwipeRefreshLayout.setColorSchemeResources(android.R.color.holo_blue_bright,
                android.R.color.holo_green_light,
                android.R.color.holo_orange_light,
                android.R.color.holo_red_light);
        mSwipeRefreshLayout.setOnRefreshListener(this);
        initRecyclerView();
        return fragment;
    }

    private void initRecyclerView() {
        mRecyclerView.setLayoutManager(new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL));
        switch (type) {
            case TheaterBaseFragment.INTHEATER:
                mItemTheaterRvAdapter = new ItemTheaterRvAdapter(getActivity(), mDoubanNormalBean);
                mItemTheaterRvAdapter.setItemClickListener(this);
                mRecyclerView.setAdapter(mItemTheaterRvAdapter);
                break;
            case TheaterBaseFragment.COMINGSOON:
                mItemTheaterRvAdapter = new ItemTheaterRvAdapter(getActivity(), mDoubanNormalBean);
                mItemTheaterRvAdapter.setItemClickListener(this);
                mRecyclerView.setAdapter(mItemTheaterRvAdapter);
                break;
            case TheaterBaseFragment.HIGHSCORE:
                mItemTheaterRvAdapterHighScore = new ItemTheaterRvAdapterHighScore(getActivity(), mWeeklyBean);
                mRecyclerView.setAdapter(mItemTheaterRvAdapterHighScore);
                break;
        }

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (mItemTheaterRvAdapter != null) {

        }
    }

    @Override
    public void onRefresh() {
        mITheaterPresenter.loadContent(type);
    }

    @Override
    public void showProgress() {
        mSwipeRefreshLayout.setRefreshing(true);
    }

    @Override
    public void hideProgress() {
        mSwipeRefreshLayout.setRefreshing(false);
    }


    @Override
    public void setInteaterAndComingSoonContent(DoubanNormalBean doubanNormalBean) {
        this.mDoubanNormalBean.subjects = doubanNormalBean.subjects;
        mItemTheaterRvAdapter.notifyDataSetChanged();
    }

    @Override
    public void setHighSocreContent(WeeklyBean weeklyBean) {
        this.mWeeklyBean.subjects = weeklyBean.subjects;
        mItemTheaterRvAdapterHighScore.notifyDataSetChanged();
    }

    @Override
    public void onItemClick(String id) {
        Intent toDetailIntent = new Intent(getActivity(), MovieDetailActivity.class);
        toDetailIntent.putExtra("movieid",id);
        startActivity(toDetailIntent);
    }
}
