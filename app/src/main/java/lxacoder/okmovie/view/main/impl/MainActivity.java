package lxacoder.okmovie.view.main.impl;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatDelegate;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabSelectListener;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import lxacoder.okmovie.R;
import lxacoder.okmovie.config.CommonConfig;
import lxacoder.okmovie.presenter.main.IMainPresenter;
import lxacoder.okmovie.presenter.main.impl.MainPresenterImpl;
import lxacoder.okmovie.view.main.MainView;
import lxacoder.okmovie.view.mine.impl.MineFragmentImpl;
import lxacoder.okmovie.view.news.impl.NewsListFragment;
import lxacoder.okmovie.view.rank.impl.RankFragmentImpl;
import lxacoder.okmovie.view.theater.ITheaterFragment;
import lxacoder.okmovie.view.theater.impl.TheaterBaseFragment;
import lxacoder.okmovie.view.theater.impl.TheaterFragmentImpl;


public class MainActivity extends AppCompatActivity implements OnTabSelectListener, MainView {

    private static final String TAG = "MainActivity";

    @BindView(R.id.bottomBar)
    BottomBar mBottomBar;
    @BindView(R.id.noNet)
    TextView mNoNet;
    IMainPresenter mIMainPresenter;

    FragmentManager mManager;

    MineFragmentImpl mMineFragment;
    NewsListFragment mNewsListFragment;
    RankFragmentImpl mRankFragment;
    TheaterBaseFragment mTheaterBaseFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        if (savedInstanceState != null)
            Log.d(TAG, savedInstanceState.toString()+"-------------------");
        if (CommonConfig.isNightMode(this)) {
            getDelegate().setLocalNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        } else {
            getDelegate().setLocalNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mManager = getSupportFragmentManager();
        mIMainPresenter = new MainPresenterImpl(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        ConnectivityManager cm = (ConnectivityManager) getSystemService(AppCompatActivity.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = cm.getActiveNetworkInfo();
        if (networkInfo == null) {
            Toast.makeText(this, "当前没有网络连接", Toast.LENGTH_SHORT).show();
            mNoNet.setVisibility(View.VISIBLE);
        } else {
            mBottomBar.setOnTabSelectListener(this);
            mNoNet.setVisibility(View.INVISIBLE);
        }
    }

    @Override
    public void onTabSelected(@IdRes int tabId) {
        mIMainPresenter.bottomSwitchTo(tabId);
    }

    @Override
    public void switchToTheater() {
        hideAll();
        if (mTheaterBaseFragment == null) {
            mTheaterBaseFragment = new TheaterBaseFragment();
            mManager.beginTransaction().add(R.id.container, mTheaterBaseFragment).commit();
        } else {
            mManager.beginTransaction().show(mTheaterBaseFragment).commit();
        }
    }

    @Override
    public void switchToRank() {
        hideAll();
        if (mRankFragment == null) {
            mRankFragment = new RankFragmentImpl();
            mManager.beginTransaction().add(R.id.container, mRankFragment).commit();
        } else {
            mManager.beginTransaction().show(mRankFragment).commit();
        }
    }

    @Override
    public void switchToNews() {
        hideAll();
        if (mNewsListFragment == null) {
            mNewsListFragment = new NewsListFragment();
            mManager.beginTransaction().add(R.id.container, mNewsListFragment).commit();
        } else {
            mManager.beginTransaction().show(mNewsListFragment).commit();
        }
    }

    @Override
    public void switchToMe() {
        hideAll();
        if (mMineFragment == null) {
            mMineFragment = new MineFragmentImpl();
            mManager.beginTransaction().add(R.id.container, mMineFragment).commit();
        } else {
            mManager.beginTransaction().show(mMineFragment).commit();
        }
    }

    private void hideAll() {
        List<Fragment> fragments = mManager.getFragments();
        if (fragments != null) {
            for (int i = 0, j = fragments.size(); i < j; i++) {
                mManager.beginTransaction().hide(fragments.get(i)).commit();
            }
            Log.d(TAG, "hideAll");
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        //super.onSaveInstanceState(outState);
    }
}
