package com.example.android_projet;

public class MainModel {
    String author, burl, name, page;

    MainModel() {

    }

    public MainModel(String author, String burl, String name, String page) {
        this.author = author;
        this.burl = burl;
        this.name = name;
        this.page = page;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBurl() {
        return burl;
    }

    public void setBurl(String burl) {
        this.burl = burl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }
}
