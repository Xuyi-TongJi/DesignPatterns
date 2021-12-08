package edu.seu.principle.singleResponsibility;

public class SingleResponsibility2 {
    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("摩托车");
        roadVehicle.run("汽车");
        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");
        // 违反了单一指责原则
    }
}

// 方式2遵守了单一职责原则
// 但是这样做的花销很大，即需要将类分解，同时修改客户端
// 改进：直接修改Vehicle类，改动的代码会比较少
class RoadVehicle{
    public void run(String vehicle){
        System.out.println(vehicle + "在公路上");
    }
}

class AirVehicle{
    public void run(String vehicle){
        System.out.println(vehicle + "在天上");
    }
}
