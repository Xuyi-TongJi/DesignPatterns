package edu.seu.builder.improve.builderPatternRoles.impl;

import edu.seu.builder.improve.builderPatternRoles.HouseBuilder;

public class HighBuildingBuilder extends HouseBuilder {

    @Override
    public void buildBasic() {
        this.house.setBasic("100m basic");
        System.out.println("高楼打地基");
    }

    @Override
    public void buildWall() {
        this.house.setWall("100m wall");
        System.out.println("高楼砌墙");
    }

    @Override
    public void roofed() {
        this.house.setRoof("100m roof");
        System.out.println("高楼盖屋顶");
    }
}
