package edu.seu.decorator;

// 抽象缓冲层,抽象类不一定需要抽象方法
// 新增咖啡种类，直接继承该类即可
public abstract class Coffee extends Drink {

    @Override
    public float cost() {
        return super.getPrice();
    }
}