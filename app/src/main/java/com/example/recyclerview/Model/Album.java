package com.example.recyclerview.Model;

public class Album {

    private String name;
    private int numOfSongs;
    private int tuhmbnail;

    public Album() {
    }

    public Album(String name, int numOfSongs, int tuhmbnail) {
        this.name = name;
        this.numOfSongs = numOfSongs;
        this.tuhmbnail = tuhmbnail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfSongs() {
        return numOfSongs;
    }

    public void setNumOfSongs(int numOfSongs) {
        this.numOfSongs = numOfSongs;
    }

    public int getTuhmbnail() {
        return tuhmbnail;
    }

    public void setTuhmbnail(int tuhmbnail) {
        this.tuhmbnail = tuhmbnail;
    }
}
