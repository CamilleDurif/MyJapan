package com.example.cdurif.myjapan.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.cdurif.myjapan.fragment.Tab1_poi;
import com.example.cdurif.myjapan.fragment.Tab2_media;
import com.example.cdurif.myjapan.fragment.Tab3_apps;

import java.util.List;

/**
 * Created by cdurif on 06/01/2017.
 */

public class PagerAdapter extends FragmentStatePagerAdapter {

    List<Fragment> fragmentList;
    List<String> titleList;

    public PagerAdapter(FragmentManager fm, List<Fragment> fragmentList, List<String> titleList) {
        super(fm);
        this.fragmentList = fragmentList;
        this.titleList = titleList;
    }

    //return the current tab
    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount(){
        return fragmentList.size();
    }

    @Override
    public CharSequence getPageTitle(int position){
        return titleList.get(position);
    }
}
