package edu.seu.principle.singleResponsibility;

public class SingleResponsibility3 {
    public static void main(String[] args) {
        Vehicle2 vehicle2 = new Vehicle2();
        vehicle2.runRoad("汽车");
        vehicle2.runAir("飞机");
    }
}

// 方式3：这种修改方法没有对原来的类做大的修改，只是增加了方法
// 这里虽然在类这个级别上遵守单一职责原则，但是在方法级别上，仍然遵守单一职责。只有在类中方法数量足够少，才能在方法级别保持单一指责原则
// 单一职责：各司其职。
class Vehicle2{
    public void runRoad(String vehicle){
        System.out.println(vehicle + "在公路上");
    }

    public void runAir(String vehicle){
        System.out.println(vehicle + "在天上");
    }
}
