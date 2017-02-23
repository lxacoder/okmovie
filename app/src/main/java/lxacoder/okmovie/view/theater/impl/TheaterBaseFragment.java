package lxacoder.okmovie.view.theater.impl;


import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.miguelcatalan.materialsearchview.MaterialSearchView;

import butterknife.BindView;
import butterknife.ButterKnife;
import lxacoder.okmovie.R;
import lxacoder.okmovie.adapter.ViewpagerAdapter;
import lxacoder.okmovie.config.CommonConfig;

/**
 * A simple {@link Fragment} subclass.
 */
public class TheaterBaseFragment extends Fragment{

    private static final String TAG="TheaterBaseFragment";

    public static final int INTHEATER = 0;
    public static final int COMINGSOON = 1;
    public static final int HIGHSCORE = 2;
    @BindView(R.id.toolbar)
    Toolbar mToolbar;
    //搜索框
    @BindView(R.id.searchView)
    MaterialSearchView mSearchView;
    @BindView(R.id.titleTv)
    TextView mTitleView;

    @BindView(R.id.tabLayout)
    TabLayout mTabLayout;
    @BindView(R.id.viewPager)
    ViewPager mViewPager;
    AppCompatActivity activity;
    private ViewpagerAdapter mAdapter;

    private boolean isNightMode;

    public TheaterBaseFragment() {

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View fragment =  inflater.inflate(R.layout.fragment_theater,container,false);
        ButterKnife.bind(this,fragment);
        mAdapter = new ViewpagerAdapter(getChildFragmentManager());
        initViewPager();
        mTabLayout.addTab(mTabLayout.newTab().setText("正在热映"));
        mTabLayout.addTab(mTabLayout.newTab().setText("即将上映"));
        mTabLayout.addTab(mTabLayout.newTab().setText("高分好评"));
        mTabLayout.setupWithViewPager(mViewPager);
        activity = ((AppCompatActivity)getActivity());
        isNightMode = CommonConfig.isNightMode(activity);
        activity.setSupportActionBar(mToolbar);
        activity.getSupportActionBar().setDisplayShowTitleEnabled(false);
        mTitleView.setText(R.string.app_name);
        Typeface typeface = Typeface.createFromAsset(activity.getAssets(), "font/sf.ttf");
        mTitleView.setTypeface(typeface);
        if (isNightMode){
            mTitleView.setTextColor(Color.parseColor("#E0E0E0"));
        }
        return fragment;
    }

    private void initViewPager(){
        mAdapter.addFragment(TheaterFragmentImpl.newInstance(INTHEATER),"正在热映");
        mAdapter.addFragment(TheaterFragmentImpl.newInstance(COMINGSOON),"即将上映");
        mAdapter.addFragment(TheaterFragmentImpl.newInstance(HIGHSCORE),"高分好评");
        mViewPager.setAdapter(mAdapter);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.main_menu, menu);
        MenuItem item = menu.findItem(R.id.action_search);
        if (isNightMode){
            item.setIcon(R.drawable.ic_action_search);
        }
        mSearchView.setMenuItem(item);
        mSearchView.setVoiceSearch(true);
    }
}
