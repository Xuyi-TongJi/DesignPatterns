package edu.seu.builder.traditional;

import edu.seu.builder.traditional.impl.Cottage;

public class Client {
    public static void main(String[] args) {
        buildHouseTraditional(new Cottage());
    }

    public static void buildHouseTraditional(AbstractHouse house){
        house.build();
    }

    public static void buildHouseImprove(){

    }
}
