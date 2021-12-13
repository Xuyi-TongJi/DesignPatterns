package edu.seu.decorator;

public class Decorator extends Drink{

    // 继承并组合一个Drink(Component主体类)
    private Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public float cost() {
        // 得到自己的价格 + 被装饰的drink的价格（递归）
        return super.getPrice() + drink.cost();
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ":" + super.getPrice()
                + "&&" + drink.getDescription();
    }
}
