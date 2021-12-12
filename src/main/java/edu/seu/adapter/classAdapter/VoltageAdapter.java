package edu.seu.adapter.classAdapter;

import edu.seu.adapter.env.IVoltage5V;
import edu.seu.adapter.env.Voltage220V;

// 适配器类，继承src被适配类
// 缺点：src类的方法在Adapter中会暴露出来，耦合度增加
public class VoltageAdapter extends Voltage220V implements IVoltage5V {

    @Override
    public int output5V() {
        // 获取到220V电压
        int src = output220V();
        // 降压
        System.out.println("电压转换为5V");
        int dst = src / 44;
        // 返回适配目标
        return dst;
    }
}
