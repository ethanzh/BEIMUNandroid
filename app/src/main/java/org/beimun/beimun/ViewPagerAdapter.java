package org.beimun.beimun;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

class ViewPagerAdapter extends FragmentStatePagerAdapter {

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        Fragment fragment = null;
        if (i == 0) {
            fragment = new Day1();
        }
        if (i == 1) {
            fragment = new Day2();
        }
        if (i == 2) {
            fragment = new Day3();
        }
        if (i == 3) {
            fragment = new Day4();
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 4;
    }
}