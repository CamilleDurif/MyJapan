package com.example.cdurif.myjapan.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cdurif.myjapan.data.Poi;
import com.example.cdurif.myjapan.R;

import java.util.List;
/**
 * Created by cdurif on 06/01/2017.
 */

public class PoiAdapter extends RecyclerView.Adapter<PoiAdapter.PoiViewHolder> {

    //private Context mContext;
    private List<Poi> poiList;

    public PoiAdapter(List<Poi> poiList){

        //this.mContext = mContext;
        this.poiList = poiList;

    }

    @Override
    public PoiViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.poi_card, parent, false);
        return new PoiViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final PoiViewHolder holder, int position){
        Poi poi = poiList.get(position);
        holder.name.setText(poi.getName());
        holder.img.setImageResource(poi.getImg());
        //Glide.with().load(poi.getImg()).into(holder.img);
    }

    @Override
    public int getItemCount(){
        return poiList.size();
    }


    public class PoiViewHolder extends RecyclerView.ViewHolder{

        public TextView name;
        public ImageView img;

        public PoiViewHolder(View view){

            super(view);
            name = (TextView)view.findViewById(R.id.poi_name);
            img = (ImageView)view.findViewById(R.id.poi_img);

        }

    }


}
