package edu.seu.facade;

import edu.seu.facade.module.DVDPlayer;
import edu.seu.facade.module.Popcorn;
import edu.seu.facade.module.Projector;
import edu.seu.facade.module.Screen;

public class TheaterFacade {

    // 定义各个子系统的对象
    private final DVDPlayer dvdPlayer;
    private final Popcorn popcorn;
    private final Projector projector;
    private final Screen screen;

    // Constructor

    public TheaterFacade() {
        this.dvdPlayer = DVDPlayer.getInstance();
        this.popcorn = Popcorn.getInstance();
        this.projector = Projector.getInstance();
        this.screen = Screen.getInstance();
    }

    public void ready() {
        popcorn.on();
        popcorn.pop();
        popcorn.off();
        screen.up();
        projector.on();
        screen.on();
        dvdPlayer.on();
    }

    public void play() {
        projector.focus();
        dvdPlayer.play();
    }

    public void pause() {
        dvdPlayer.pause();
    }

    public void end() {
        dvdPlayer.off();
        projector.off();
        screen.off();
        screen.down();
    }
}
