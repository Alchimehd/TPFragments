package com.example.mercredi.vue;

/**
 * Created by Mercredi on 25/02/2016.
 */
public class Book {
    private String title;
    private int cover;

    public Book(String title, int cover) {
        this.cover = cover;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCover() {
        return cover;
    }

    public void setCover(int cover) {
        this.cover = cover;
    }
}
