package com.example.cdurif.myjapan.fragment;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.cdurif.myjapan.data.Poi;
import com.example.cdurif.myjapan.R;
import com.example.cdurif.myjapan.adapter.PoiAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cdurif on 06/01/2017.
 */

public class PoiFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        View rootView =  inflater.inflate(R.layout.poi_tab, container, false);

        RecyclerView recViewPoi = (RecyclerView)rootView.findViewById(R.id.recycler_poi);
        recViewPoi.setHasFixedSize(true);
        recViewPoi.setAdapter(new PoiAdapter(createPoiList()));

        StaggeredGridLayoutManager sglm = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        recViewPoi.setLayoutManager(sglm);


        return rootView;


    }

    public List<Poi> createPoiList(){

        List<Poi> poiList = new ArrayList<>();

        poiList.add(new Poi("Udon", R.drawable.udon));
        poiList.add(new Poi("Tokyo Tower", R.drawable.tokyo_tower));
        poiList.add(new Poi("Torii at Fushimi Inari", R.drawable.torii));
        poiList.add(new Poi("Great Wave by Hokusai", R.drawable.wave));
        poiList.add(new Poi("Bento", R.drawable.bento));
        poiList.add(new Poi("Osaka", R.drawable.osaka));
        poiList.add(new Poi("Shibuya crossing", R.drawable.hachiko));

        return poiList;

    }

}
