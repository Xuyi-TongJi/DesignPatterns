package edu.seu.adapter.objectAdapter;

import edu.seu.adapter.env.IVoltage5V;
import edu.seu.adapter.env.Voltage220V;

// 对象适配器模式,用聚合关系替代继承
// 依旧需要implement IVoltage5V接口
public class VoltageAdapter implements IVoltage5V {

    private Voltage220V voltage220V;  // 聚合

    public VoltageAdapter() {}

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int dst = 0;
        if (null != voltage220V) {
            int src = voltage220V.output220V();
            System.out.println("对象适配器进行转换为5V");
            dst = src / 44;
        } else {
            System.out.println("请插入源电压");
        }
        return dst;
    }
}
