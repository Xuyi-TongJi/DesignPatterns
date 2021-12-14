package edu.seu.facade.module;

public class DVDPlayer {

    // singleton
    private static final DVDPlayer instance = new DVDPlayer();

    public static DVDPlayer getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("dvd on");
    }

    public void off() {
        System.out.println("dvd off");
    }

    public void play() {
        System.out.println("dvd is playing");
    }

    public void pause() {
        System.out.println("dvd pause...");
    }
}
