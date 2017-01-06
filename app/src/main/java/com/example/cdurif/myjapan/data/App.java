package com.example.cdurif.myjapan.data;

/**
 * Created by cdurif on 06/01/2017.
 */

public class App {

    private String name;
    private String desc;
    private int img;

    public App(String name, String desc, int img){
        this.name = name;
        this.desc = desc;
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


}
