package com.example.uicitybazar.Model;

public class Blogger {

    private int id;
    private String bloggerName;
    private String bloggerImage;

     public Blogger()
     {}

    public Blogger(int id, String bloggerName, String bloggerImage) {
        this.id = id;
        this.bloggerName = bloggerName;
        this.bloggerImage = bloggerImage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBloggerName() {
        return bloggerName;
    }

    public void setBloggerName(String bloggerName) {
        this.bloggerName = bloggerName;
    }

    public String getBloggerImage() {
        return bloggerImage;
    }

    public void setBloggerImage(String bloggerImage) {
        this.bloggerImage = bloggerImage;
    }
}
