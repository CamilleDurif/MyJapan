package com.example.cdurif.myjapan.data;

/**
 * Created by cdurif on 06/01/2017.
 */

public class Poi {

    private String name;
    private int img;

    public Poi(String name, int img){
        this.name = name;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }


}
