package com.github.guwenk.smuradio;

class Tracks {
    private String artist;
    private String title;
    private String filename;

    String getFilename() {
        return filename;
    }

    void setFilename(String filename) {
        this.filename = filename;
    }

    String getArtist() {
        return artist;
    }

    void setArtist(String artist) {
        this.artist = artist;
    }

    String getTitle() {
        return title;
    }

    void setTitle(String title) {
        this.title = title;
    }
}
