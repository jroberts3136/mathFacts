package com.company;

/**
 * Created by jroberts3136 on 1/11/18.
 */
public interface Music {
    String song();
    String album();
    String genre();
    String artist();
    double length();
    void play();
    void pause();
    void nextTrack();
    void lastTrack();
}
