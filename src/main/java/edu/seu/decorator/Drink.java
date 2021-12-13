package edu.seu.decorator;

import lombok.Data;

// 新增饮料种类（抽象层），直接继承该类即可
@Data
public abstract class Drink {

    public String description;
    private float price = 0.0f;

    // 计算价格
    public abstract float cost();
}
