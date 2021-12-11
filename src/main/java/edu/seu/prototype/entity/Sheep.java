package edu.seu.prototype.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
// 要支持Object.clone()方法，必须实现Cloneable接口
public class Sheep implements Cloneable {
    private String name;
    private int age;
    private String color;

    // 克隆该实例，使用默认的clone方法来完成
    // 浅拷贝
    @Override
    public Object clone() {
        Sheep sheep = null;
        try {
            sheep = (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return sheep;
    }
}
