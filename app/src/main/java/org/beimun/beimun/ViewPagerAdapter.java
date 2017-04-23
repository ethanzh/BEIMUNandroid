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
            //fragment = new MyCards();
        }
        if (i == 1) {
            //fragment = new MainFragment();
        }
        if (i == 2) {
            //fragment = new MyProfile();
        }
        if (i == 3) {
            //fragment = new MyProfile();
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 4;
    }
}