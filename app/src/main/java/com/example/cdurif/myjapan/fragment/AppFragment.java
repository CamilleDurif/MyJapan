package com.example.cdurif.myjapan.fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
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

public class AppFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        View rootView = inflater.inflate(R.layout.app_tab, container, false);

        RecyclerView recViewApp = (RecyclerView)rootView.findViewById(R.id.recycler_app);
        recViewApp.setHasFixedSize(true);

        AppAdapter adapter = new AppAdapter(createAppList());
        adapter.setOnAppCellClickListener(new AppAdapter.OnAppCellClickListener() {
            @Override
            public void onCellClick(String url) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        } );

        recViewApp.setAdapter(adapter);

        LinearLayoutManager llm = new LinearLayoutManager(getContext());
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        recViewApp.setLayoutManager(llm);

        DividerItemDecoration did = new DividerItemDecoration(recViewApp.getContext(), llm.getOrientation());
        recViewApp.addItemDecoration(did);

        return rootView;

    }

    public List<App> createAppList(){

        List<App> appList = new ArrayList<>();

        appList.add(new App("Japanese English Dictionnary", "Intuitive research", R.drawable.jed, getResources().getString(R.string.jed_url)));
        appList.add(new App("Akebi Japanese Dictionnary", "Handwritting recognition", R.drawable.akebi, getResources().getString(R.string.akebi_url)));
        appList.add(new App("Kanji Senpai", "Learn japanese vocabulary and kanji", R.drawable.kanji, getResources().getString(R.string.kanji_url)));
        appList.add(new App("Traduction", "Instant photo-traduction", R.drawable.trad, getResources().getString(R.string.trad_url)));

        return appList;

    }

}
