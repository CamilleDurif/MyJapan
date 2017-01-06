package com.example.cdurif.myjapan.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cdurif.myjapan.data.App;
import com.example.cdurif.myjapan.R;

import java.util.List;

/**
 * Created by cdurif on 06/01/2017.
 */

public class AppAdapter extends RecyclerView.Adapter<AppAdapter.AppViewHolder> {

    private List<App> appList;

    public AppAdapter(List<App> appList){
        this.appList = appList;
    }

    @Override
    public AppViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType){
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.app_card, viewGroup, false);
        return new AppViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(AppViewHolder appViewHolder, int position){

        App app = appList.get(position);
        appViewHolder.name.setText(app.getName());
        appViewHolder.desc.setText(app.getDesc());
        appViewHolder.img.setImageResource(app.getImg());

    }

    @Override
    public int getItemCount(){
        return appList.size();
    }


    public class AppViewHolder extends RecyclerView.ViewHolder{

        public TextView name, desc;
        public ImageView img;

        public AppViewHolder(View view){

            super(view);
            name = (TextView)view.findViewById(R.id.app_name);
            desc = (TextView)view.findViewById(R.id.app_desc);
            img = (ImageView)view.findViewById(R.id.app_ico);

        }

    }

}
