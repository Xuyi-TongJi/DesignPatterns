package edu.seu.builder.improve;

import edu.seu.builder.improve.builderPatternRoles.House;
import edu.seu.builder.improve.builderPatternRoles.HouseDirector;
import edu.seu.builder.improve.builderPatternRoles.impl.CommonHouseBuilder;
import edu.seu.builder.improve.builderPatternRoles.impl.HighBuildingBuilder;

public class Client {
    public static void main(String[] args) {
        // 生产一个普通房子
        CommonHouseBuilder commonHouseBuilder = new CommonHouseBuilder();
        HouseDirector houseDirector = new HouseDirector(commonHouseBuilder);
        House house = houseDirector.construct();// 完成对象创建操作，返回最终产品
        System.out.println(house);
        System.out.println("----------------");
        // 生产一个高楼
        houseDirector.setHouseBuilder(new HighBuildingBuilder());
        House house2 = houseDirector.construct();
        System.out.println(house2);
    }
}
