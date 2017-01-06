package com.example.cdurif.myjapan.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

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
        recViewMedia.setAdapter(new MediaAdapter(createMediaList()));

        GridLayoutManager glm = new GridLayoutManager(getContext(), 2);
        recViewMedia.setLayoutManager(glm);

        return rootView;

    }


    public List<Media> createMediaList(){

        List<Media> mediaList = new ArrayList<>();

        mediaList.add(new Media("Anime1", "2 episodes", 2016, R.drawable.album1));
        mediaList.add(new Media("Anime2", "3 episodes", 2005, R.drawable.album1));

        return mediaList;

    }

}
