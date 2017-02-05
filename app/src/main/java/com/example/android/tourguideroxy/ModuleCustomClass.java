package com.example.android.tourguideroxy;

public class ModuleCustomClass {
    private String name;
    private int imageSource;

    public ModuleCustomClass(String name, int imageSource) {
        this.name = name;
        this.imageSource = imageSource;
    }

    public String getName() {
        return name;
    }

    public int getImageSource() {
        return imageSource;
    }
}