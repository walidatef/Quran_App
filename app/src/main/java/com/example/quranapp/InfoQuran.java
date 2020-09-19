package com.example.quranapp;

public class InfoQuran {
    private String soraName;
    private String sheikhName;
    private int mediaSora;
    private int mediaImage;


    public InfoQuran(String soraName, String sheikhName, int mediaSora, int mediaImage) {
        this.mediaImage = mediaImage;
        this.soraName = soraName;
        this.sheikhName = sheikhName;
        this.mediaSora = mediaSora;
    }

    public int getMediaImage() {
        return mediaImage;
    }

    public String getSoraName() {
        return soraName;
    }

    public String getSheikhName() {
        return sheikhName;
    }

    public int getMediaSora() {
        return mediaSora;
    }


}
