package edu.seu.builder.traditional;

public abstract class AbstractHouse {

    public abstract void buildBasic();
    public abstract void buildWalls();
    public abstract void roofed();

    public void build(){
        buildBasic();
        buildWalls();
        roofed();
    }
}
