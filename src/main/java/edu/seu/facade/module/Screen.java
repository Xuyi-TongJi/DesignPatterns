package edu.seu.facade.module;

public class Screen {

    private static final Screen instance = new Screen();

    public static Screen getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("screen on");
    }

    public void off() {
        System.out.println("screen off");
    }

    public void up() {
        System.out.println("screen up");
    }

    public void down() {
        System.out.println("screen down");
    }
}
