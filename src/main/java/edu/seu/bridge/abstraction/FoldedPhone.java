package edu.seu.bridge.abstraction;

import edu.seu.bridge.implementation.Brand;

public class FoldedPhone extends Phone{

    public FoldedPhone(Brand brand) {
        super(brand);
    }

    public void open() {
        super.open();
        System.out.println("打开折叠样式手机");
    }

    public void close() {
        super.open();
        System.out.println("关闭折叠样式手机");
    }

    public void call() {
        super.open();
        System.out.println("折叠样式手机通话");
    }
}
