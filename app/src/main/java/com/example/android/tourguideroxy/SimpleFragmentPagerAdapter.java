
package com.example.android.tourguideroxy;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    private final int PAGE_COUNT = 4;

    private String tabTitles[] = new String[]{
            LocationsFragment.NAME,
            EventsFragment.NAME,
            FoodFragment.NAME,
            StatesFragment.NAME};

    private Context mContext;

    public SimpleFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position) {
            case 0:
                fragment = Fragment.instantiate(mContext, LocationsFragment.class.getName());
                break;
            case 1:
                fragment = Fragment.instantiate(mContext, EventsFragment.class.getName());
                break;
            case 2:
                fragment = Fragment.instantiate(mContext, FoodFragment.class.getName());
                break;
            case 3:
                fragment = Fragment.instantiate(mContext, StatesFragment.class.getName());
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }
}