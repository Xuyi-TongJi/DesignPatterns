package edu.seu.principle.singleResponsibility;

public class SingleResponsibility1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("摩托车");
        vehicle.run("汽车");
        vehicle.run("飞机");
        // 违反了单一指责原则
    }
}

// 在方式1的run方法中，违反了单一职责原则
// 解决的方案：根据交通工具运行方式不同，分解成不同类即可
class Vehicle{
    public void run(String vehicle){
        System.out.println(vehicle + "在公路上");
    }
}
