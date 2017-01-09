package com.example.cdurif.myjapan.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
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

public class MediaFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        View rootView = inflater.inflate(R.layout.media_tab, container, false);

        RecyclerView recViewMedia = (RecyclerView)rootView.findViewById(R.id.recycler_media);
        recViewMedia.setHasFixedSize(true);

        MediaAdapter adapter = new MediaAdapter(createMediaList());
        adapter.setOnCellClickListener(new MediaAdapter.OnCellClickListener() {
            @Override
            public void onClick(Media media) {
                // http://stackoverflow.com/questions/768969/passing-a-bundle-on-startactivity?answertab=active#tab-top
                Intent intent = new Intent(getContext(), MediaDetailsActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("TITLE", media.getName());
                bundle.putString("DESC", media.getDesc());
                bundle.putInt("YEAR", media.getYear());
                bundle.putInt("IMG", media.getImg());
                bundle.putString("LONG", getResources().getString(media.getLongDesc())); //to get the resource as a string and not the id (int) of the resource
                intent.putExtras(bundle);
                startActivity(intent);
            }

            @Override
            public void onFavClick(Media media) {
                if(!media.isFav()) {
                    media.setFav(true);
                    Toast.makeText(getContext(), "Add to favorites", Toast.LENGTH_SHORT).show();
                }
                else
                    media.setFav(false);

            }
        });
        recViewMedia.setAdapter(adapter);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        recViewMedia.setLayoutManager(llm);

        return rootView;

    }


    public List<Media> createMediaList(){

        List<Media> mediaList = new ArrayList<>();

        mediaList.add(new Media("My Neighbor Totoro", "Hayao Miyazaki", R.string.totoro_long_desc, 1988, R.drawable.totoro));
        mediaList.add(new Media("Seven Samurai", "Akira Kurosawa", R.string.samurai_long_desc, 1954, R.drawable.samurai));
        mediaList.add(new Media("Princess Mononoke", "Hayao Miyazaki", R.string.mononoke_long_desc, 1997, R.drawable.mononoke));
        mediaList.add(new Media("Spirited Away", "Hayao Miyazaki", R.string.chihiro_long_desc, 2001, R.drawable.chihiro));

        return mediaList;

    }

}
