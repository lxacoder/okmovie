package lxacoder.okmovie.view.news.impl;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.BindView;
import butterknife.ButterKnife;
import lxacoder.okmovie.R;
import lxacoder.okmovie.beans.NewsListBean;
import lxacoder.okmovie.config.CommonConfig;
import lxacoder.okmovie.config.RecyclerViewDecoration;
import lxacoder.okmovie.presenter.news.INewsListPresenter;
import lxacoder.okmovie.presenter.news.impl.NewsListPresenterImpl;
import lxacoder.okmovie.view.news.INewsListFragment;
import lxacoder.okmovie.view.news.adapter.NewsListRvAdapter;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * A simple {@link Fragment} subclass.
 */
public class NewsListFragment extends Fragment implements INewsListFragment, SwipeRefreshLayout.OnRefreshListener {

    private static final String TAG = "NewsListFragment";

    @BindView(R.id.newsListRv)
    RecyclerView mNewsListRv;
    @BindView(R.id.swipeRefresh)
    SwipeRefreshLayout mSwipeRefresh;

    private Context mContext;
    private NewsListBean mNewsListBean = new NewsListBean();

    private NewsListRvAdapter mAdapter;

    INewsListPresenter mPresenter;

    private int pageIndex = 1;
    public NewsListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.from(container.getContext()).inflate(R.layout.fragment_news,container,false);
        ButterKnife.bind(this, view);
        mContext = getActivity();
        mPresenter = new NewsListPresenterImpl(this);
        mPresenter.loadNews(pageIndex);
        initRecyclerView();
        initSwipeRefreshLayout();
        return view;
    }

    public void initRecyclerView(){
        final LinearLayoutManager manager = new LinearLayoutManager(mContext);
        mNewsListRv.setLayoutManager(manager);
        mAdapter = new NewsListRvAdapter(mContext,mNewsListBean);
        mNewsListRv.addItemDecoration(new RecyclerViewDecoration(mContext,0, CommonConfig.isNightMode(getActivity())));
        mNewsListRv.addOnScrollListener(new RecyclerView.OnScrollListener() {
            private int lastVisibleItem;
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
                if (newState == RecyclerView.SCROLL_STATE_IDLE
                        && lastVisibleItem + 1 == mAdapter.getItemCount()
                        && mAdapter.isShowFooter()) {
                    pageIndex = pageIndex+1;
                    mPresenter.loadNews(pageIndex);
                }
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                lastVisibleItem = manager.findLastVisibleItemPosition();
            }
        });
        mNewsListRv.setAdapter(mAdapter);
    }

    private void initSwipeRefreshLayout() {
        mSwipeRefresh.setColorSchemeResources(android.R.color.holo_blue_bright,
                android.R.color.holo_green_light,
                android.R.color.holo_orange_light,
                android.R.color.holo_red_light);
        mSwipeRefresh.setOnRefreshListener(this);
    }

    @Override
    public void showContent(NewsListBean newsListBean) {
        if (mNewsListBean.newsList == null){
            mNewsListBean.newsList = newsListBean.newsList;
        }else {
            mNewsListBean.newsList.addAll(newsListBean.newsList);
        }
        mAdapter.notifyDataSetChanged();
    }

    @Override
    public void showProgress() {
        mSwipeRefresh.setRefreshing(true);
    }

    @Override
    public void hideProgress() {
        mSwipeRefresh.setRefreshing(false);
    }

    @Override
    public void onRefresh() {
        mNewsListBean.newsList.clear();
        pageIndex = 1;
        mPresenter.loadNews(pageIndex);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"onDestroy");
    }
}
