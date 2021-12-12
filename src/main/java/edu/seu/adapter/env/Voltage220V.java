package edu.seu.adapter.env;

// 被适配的类
public class Voltage220V {
    public int output220V() {
        int src = 220;
        System.out.println("源输出电压" + src + "V");
        return src;
    }
}
