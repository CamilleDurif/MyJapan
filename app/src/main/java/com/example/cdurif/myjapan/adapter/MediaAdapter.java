package com.example.cdurif.myjapan.adapter;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.cdurif.myjapan.data.Media;
import com.example.cdurif.myjapan.MediaDetailsActivity;
import com.example.cdurif.myjapan.R;

import java.util.List;

/**
 * Created by cdurif on 06/01/2017.
 */

public class MediaAdapter extends RecyclerView.Adapter<MediaAdapter.MediaViewHolder> {

    private List<Media> mediaList;

    public MediaAdapter(List<Media> mediaList){
        this.mediaList = mediaList;
    }

    @Override
    public MediaViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.media_card, parent, false);
        return new MediaAdapter.MediaViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MediaAdapter.MediaViewHolder holder, int position){
        Media media = mediaList.get(position);
        holder.name.setText(media.getName());
        holder.desc.setText(media.getDesc());
        holder.year.setText("" + media.getYear());
        holder.img.setImageResource(media.getImg());
        //Glide.with().load(poi.getImg()).into(holder.img);
    }

    @Override
    public int getItemCount(){
        return mediaList.size();
    }

    public class MediaViewHolder extends RecyclerView.ViewHolder{

        public TextView name, desc, year;
        public ImageView img;

        public MediaViewHolder(View view){

            super(view);

            name = (TextView)view.findViewById(R.id.med_name);
            desc = (TextView)view.findViewById(R.id.med_desc);
            year = (TextView)view.findViewById(R.id.med_year);
            img = (ImageView)view.findViewById(R.id.med_img);

            view.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view){

                    Toast.makeText(view.getContext(), "CLIC", Toast.LENGTH_SHORT).show();

                    view.getContext().startActivity(new Intent(view.getContext(), MediaDetailsActivity.class));

                }
            });

        }
    }

}
