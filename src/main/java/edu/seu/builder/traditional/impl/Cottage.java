package edu.seu.builder.traditional.impl;

import edu.seu.builder.traditional.AbstractHouse;

public class Cottage extends AbstractHouse {
    @Override
    public void buildBasic() {
        System.out.println("cottage" + "buildBasic");
    }

    @Override
    public void buildWalls() {
        System.out.println("cottage" + "buildWalls");
    }

    @Override
    public void roofed() {
        System.out.println("cottage" + "roofed");
    }
}
