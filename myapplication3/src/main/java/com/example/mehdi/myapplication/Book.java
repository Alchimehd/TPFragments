package com.example.mehdi.myapplication;

import java.io.Serializable;

/**
 * Created by Mehdi on 03/03/2016.
 */
public class Book implements Serializable{
    private String title;
    private String author;

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;

    }
}
