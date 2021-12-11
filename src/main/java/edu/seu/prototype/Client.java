package edu.seu.prototype;

import edu.seu.prototype.entity.DeepCloneableTarget;
import edu.seu.prototype.entity.DeepPrototype;
import edu.seu.prototype.entity.Sheep;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        deepCloneMethodBySerializable();
    }

    public static void traditionCloneMethod() {
        Sheep sheep = new Sheep("tom", 1, "white");
        Sheep sheep1 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep2 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());

        System.out.println(sheep1);
        System.out.println(sheep2);
    }

    public static void cloneMethod(){
        Sheep sheep = new Sheep("tom", 1, "white");
        Sheep sheep1 = (Sheep) sheep.clone();  // 不用关注克隆的具体实现步骤
        Sheep sheep2 = (Sheep) sheep.clone();
        System.out.println(sheep1 == sheep2);  // false
    }

    public static void deepCloneMethod() throws CloneNotSupportedException {
        DeepCloneableTarget deepCloneableTarget = new DeepCloneableTarget("hello", "world");
        DeepPrototype deep  = new DeepPrototype("hello", deepCloneableTarget);
        DeepPrototype clone1 = (DeepPrototype) deep.clone();
        DeepPrototype clone2 = (DeepPrototype) deep.clone();
        System.out.println(clone1.getTarget() == clone2.getTarget()); // false，实现了深拷贝
    }

    public static void deepCloneMethodBySerializable() {
        DeepCloneableTarget deepCloneableTarget = new DeepCloneableTarget("hello", "world");
        DeepPrototype deep  = new DeepPrototype("hello", deepCloneableTarget);
        DeepPrototype clone1 = (DeepPrototype) deep.deepClone();
        DeepPrototype clone2 = (DeepPrototype) deep.deepClone();
        System.out.println(clone1.getTarget() == clone2.getTarget()); // false，实现了深拷贝
    }
}
