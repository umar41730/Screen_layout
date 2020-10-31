package com.example.saddaassignment;

public class TopTenModelClass {

    Integer image;
    String title;
    String type;

    public TopTenModelClass(Integer image, String title, String type) {
        this.image = image;
        this.title = title;
        this.type = type;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
