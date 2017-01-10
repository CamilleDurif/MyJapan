package com.example.cdurif.myjapan;

import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;

import com.example.cdurif.myjapan.adapter.PagerAdapter;
import com.example.cdurif.myjapan.fragment.PoiFragment;
import com.example.cdurif.myjapan.fragment.MediaFragment;
import com.example.cdurif.myjapan.fragment.AppFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("MainActivity", "onCreate()");
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitle("My Japan (私の日本)");
        toolbar.setTitleTextColor(Color.WHITE);

        List<Fragment> fragmentList = new ArrayList<>();
        fragmentList.add(new PoiFragment());
        fragmentList.add(new MediaFragment());
        fragmentList.add(new AppFragment());

        List<String> titleList = new ArrayList<>();
        titleList.add("Pictures");
        titleList.add("Movies");
        titleList.add("Learning");

        TabLayout tabLayout = (TabLayout)findViewById(R.id.tab_layout);
        ViewPager viewPager = (ViewPager)findViewById(R.id.view_pager);
        PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager(), fragmentList, titleList);

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        getSupportActionBar().hide();
    }
}
