package com.example.cdurif.myjapan.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.cdurif.myjapan.data.App;
import com.example.cdurif.myjapan.R;
import com.example.cdurif.myjapan.adapter.AppAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cdurif on 06/01/2017.
 */

public class Tab3_apps extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        View rootView = inflater.inflate(R.layout.tab3_apps, container, false);

        RecyclerView recViewApp = (RecyclerView)rootView.findViewById(R.id.recycler_app);
        recViewApp.setHasFixedSize(true);
        recViewApp.setAdapter(new AppAdapter(createAppList()));

        LinearLayoutManager llm = new LinearLayoutManager(getContext());
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        recViewApp.setLayoutManager(llm);

        return rootView;

    }


    public List<App> createAppList(){

        List<App> appList = new ArrayList<>();

        appList.add(new App("Kanji", "dictionnaire", 1));
        appList.add(new App("Dico", "dictionnaire", 1));

        return appList;

    }

}
