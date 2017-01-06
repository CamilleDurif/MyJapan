package com.example.cdurif.myjapan.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.cdurif.myjapan.MediaDetailsActivity;
import com.example.cdurif.myjapan.data.Media;
import com.example.cdurif.myjapan.R;
import com.example.cdurif.myjapan.adapter.MediaAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cdurif on 06/01/2017.
 */

public class Tab2_media extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        View rootView = inflater.inflate(R.layout.tab2_media, container, false);

        RecyclerView recViewMedia = (RecyclerView)rootView.findViewById(R.id.recycler_media);
        recViewMedia.setHasFixedSize(true);
        MediaAdapter adapter = new MediaAdapter(createMediaList());
        adapter.setOnCellClickListener(new MediaAdapter.OnCellClickListener() {
            @Override
            public void onClick(String title) {
                // http://stackoverflow.com/questions/768969/passing-a-bundle-on-startactivity?answertab=active#tab-top
                Intent intent = new Intent(getContext(), MediaDetailsActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("TITLE", title);
                intent.putExtras(bundle);
                startActivity(intent);
            }

            @Override
            public void onFavClick(String title) {
                Toast.makeText(getContext(), "FAV", Toast.LENGTH_LONG).show();
            }
        });
        recViewMedia.setAdapter(adapter);

        //GridLayoutManager glm = new GridLayoutManager(getContext(), 2);
        //recViewMedia.setLayoutManager(glm);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        recViewMedia.setLayoutManager(llm);

        return rootView;

    }


    public List<Media> createMediaList(){

        List<Media> mediaList = new ArrayList<>();

        mediaList.add(new Media("My Neighbor Totoro", "Hayao Miyazaki", 1988, R.drawable.totoro));
        mediaList.add(new Media("Anime2", "3 episodes", 2005, R.drawable.album1));

        return mediaList;

    }

}
