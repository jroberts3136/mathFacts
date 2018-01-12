package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Press 0 for current song\n" +
            "Press 1 for artist\n" +
            "Press 2 for album\n" +
            "Press 3 for genre\n" +
            "Press 4 for length of song\n" +
            "Press 5 to play\n" +
            "Press 6 to pause\n" +
            "Press 7 for next track\n" +
            "Press 8 for last track\n" +
            "Press anything else to end the program");

        Scanner keyInput = new Scanner(System.in);
        MusicMan theMusicMan = new MusicMan();

        boolean notDone = true;
        String input;

        while (notDone){
            input = keyInput.nextLine();
            switch (input){
                case "0":
                    System.out.println(theMusicMan.song());
                    break;
                case "1":
                    System.out.println(theMusicMan.artist());
                    break;
                case "2":
                    System.out.println(theMusicMan.album());
                    break;
                case "3":
                    System.out.println(theMusicMan.genre());
                    break;
                case "4":
                    System.out.println(theMusicMan.length());
                    break;
                case "5":
                    theMusicMan.play();
                    break;
                case "6":
                    theMusicMan.pause();
                    break;
                case "7":
                    theMusicMan.nextTrack();
                    break;
                case "8":
                    theMusicMan.lastTrack();
                    break;
                default:
                    notDone = false;
            }
        }
    }
}
