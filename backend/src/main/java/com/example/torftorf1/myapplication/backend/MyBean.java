package com.example.torftorf1.myapplication.backend;

/**
 * The object model for the data we are sending through endpoints
 */
public class MyBean {

    private String myData;

    private int myJoke;

    public String getData() {
        return myData;
    }

    public void setData(String data) {
        myData = data;
    }

    public int getJoke() {
        return myJoke;
    }

    public void setJoke(int joke) {
        myJoke = joke;
    }

}