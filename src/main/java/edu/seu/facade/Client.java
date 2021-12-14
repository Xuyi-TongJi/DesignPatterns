package edu.seu.facade;

public class Client {
    public static void main(String[] args) {
        TheaterFacade theaterFacade = new TheaterFacade();
        theaterFacade.ready();
        System.out.println("--------");
        theaterFacade.play();
        System.out.println("--------");
        theaterFacade.pause();
        System.out.println("--------");
        theaterFacade.end();
    }
}
