package lxacoder.okmovie.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

import lxacoder.okmovie.view.theater.impl.TheaterFragmentImpl;

/**
 * Created by lxacoder on 2016/9/26.
 * email:lxacoder@gmail.com
 * github:https://github.com/lxacoder
 */

public class ViewpagerAdapter extends FragmentPagerAdapter {

    public List<TheaterFragmentImpl> mFragments = new ArrayList<>();
    private List<String> mTitles = new ArrayList<>();

    public ViewpagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTitles.get(position);
    }

    public void addFragment(TheaterFragmentImpl fragment, String title){
        mFragments.add(fragment);
        mTitles.add(title);
    }
}
