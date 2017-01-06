package com.example.cdurif.myjapan.data;

/**
 * Created by cdurif on 06/01/2017.
 */

public class Media {

    private String name;
    private String desc;

    private int year;
    private int img;

    public Media(String name, String desc, int year, int img){
        this.name = name;
        this.desc = desc;
        this.year = year;
        this.img = img;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
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



}