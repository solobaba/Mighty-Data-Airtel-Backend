package com.example.mighty.mightydataairtelbackend;

public class DataBalance {
    int time;
    String text;

    public DataBalance() {

    }

    public DataBalance(int time, String text) {
        this.time = time;
        this.text = text;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}