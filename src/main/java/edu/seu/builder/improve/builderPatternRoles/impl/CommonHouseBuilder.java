package edu.seu.builder.improve.builderPatternRoles.impl;

import edu.seu.builder.improve.builderPatternRoles.HouseBuilder;

public class CommonHouseBuilder extends HouseBuilder {
    @Override
    public void buildBasic() {
        this.house.setBasic("5m basic");
        System.out.println("普通房子打地基");
    }

    @Override
    public void buildWall() {
        this.house.setWall("5m wall");
        System.out.println("普通房子建墙");
    }

    @Override
    public void roofed() {
        this.house.setRoof("5m roof");
        System.out.println("普通房子封顶");
    }
}
