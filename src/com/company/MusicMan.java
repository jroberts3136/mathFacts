package com.company;

/**
 * Created by jroberts3136 on 1/11/18.
 */
public class MusicMan implements Music {
    public String album = "2String Returns";
    public String artist = "DannyP5";
    public String [] songs = {"All Star", "1000 Miles"};
    public String genre = "Underground Java";
    public boolean song = false;

    public String song(){
        if (song){
            return songs[0];
        }
        else{
            return songs[1];
        }
    }

    public String album(){
        return album;
    }

    public String genre(){
        return genre;
    }

    public String artist(){
        return artist;
    }

    public double length(){
        return Math.random() * 360;
    }

    public void play(){
        System.out.println("A song has begun.");
    }

    public void pause(){
        System.out.println("I'm sorry. You can't do that.\nVolume has been increased.");
    }

    public void nextTrack(){
        song = !song;
        System.out.println("Next song now playing.");
    }

    public void lastTrack(){
        song = !song;
        System.out.println("Last song now playing.");
    }
}
