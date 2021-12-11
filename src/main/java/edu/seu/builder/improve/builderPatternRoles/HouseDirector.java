package edu.seu.builder.improve.builderPatternRoles;

// builder pattern中的指挥者，与Client直接交互
// 动态地指定制作流程
public class HouseDirector {

    HouseBuilder houseBuilder = null; // 聚合一个houseBuilder

    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    // 如何处理建造房子的流程，由Director指挥处理
    public House construct() {
        // HouseDirector控制具体的建造流程--> 先打地基，再建墙，最后封顶
        // 具体实现由houseBuilder(的具体子类)决定
        houseBuilder.buildBasic();
        houseBuilder.buildWall();
        houseBuilder.roofed();

        // 建造完成，返回具体产品
        return houseBuilder.buildHouse();
    }
}
