package com.example.cdurif.myjapan.data;

/**
 * Created by cdurif on 06/01/2017.
 */

public class Media {

    private String name;
    private String desc;

    private int year;
    private int img;
    private int longDesc;

    private boolean fav;

    public Media(String name, String desc, int longDesc, int year, int img){
        this.name = name;
        this.desc = desc;
        this.longDesc = longDesc;
        this.year = year;
        this.img = img;
        this.fav = false;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getLongDesc() {
        return longDesc;
    }

    public void setLongDesc(String desc) {
        this.longDesc = longDesc;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isFav() {
        return fav;
    }

    public void setFav(boolean fav) {
        this.fav = fav;
    }




}