package com.example.android.quakereport;




public class Earthquake {

    private double mMagnitude;
    private String mLocation;
    private  long mTimeInMilliseconds;
    private String mUrl;

    //constructor--->

    public Earthquake(double magnitude,String location, long TimeInMilliseconds,String url){
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds=TimeInMilliseconds;
        mUrl = url;
    }

    //getters so that other classes can access the private variables --->

    public double getMagnitude(){ return  mMagnitude; }
    public String getLocation(){return mLocation; }
    public long getTimeInMilliseconds(){return mTimeInMilliseconds; }
    public String getUrl() { return mUrl; }
}
