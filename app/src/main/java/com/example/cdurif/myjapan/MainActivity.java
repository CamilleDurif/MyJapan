package com.example.cdurif.myjapan;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.cdurif.myjapan.adapter.PagerAdapter;
import com.example.cdurif.myjapan.fragment.Tab1_poi;
import com.example.cdurif.myjapan.fragment.Tab2_media;
import com.example.cdurif.myjapan.fragment.Tab3_apps;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("MainActivity", "onCreate()");
        setContentView(R.layout.activity_main);

        List<Fragment> fragmentList = new ArrayList<>();
        fragmentList.add(new Tab1_poi());
        fragmentList.add(new Tab2_media());
        fragmentList.add(new Tab3_apps());

        List<String> titleList = new ArrayList<>();
        titleList.add("POI");
        titleList.add("Media");
        titleList.add("App");

        TabLayout tabLayout = (TabLayout)findViewById(R.id.tab_layout);
        ViewPager viewPager = (ViewPager)findViewById(R.id.view_pager);
        PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager(), fragmentList, titleList);

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
