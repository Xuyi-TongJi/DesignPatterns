package edu.seu.builder.improve.builderPatternRoles;

// 抽象的建造者，定义建造房子需要哪些操作，由子类具体实现
// 不与Client直接交互
public abstract class HouseBuilder {
    // 组合一个House成员变量
    protected House house = new House();

    // 建造流程
    public abstract void buildBasic();
    public abstract void buildWall();
    public abstract void roofed();

    // 建造房子 --> 将产品返回
    public House buildHouse() {
        return house;
    }
}
