package com.example.cdurif.myjapan.data;

/**
 * Created by cdurif on 06/01/2017.
 */

public class App {

    private String name;
    private String desc;
    private String url;
    private int img;

    public App(String name, String desc, int img, String url){
        this.name = name;
        this.desc = desc;
        this.img = img;
        this.url = url;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }


}
