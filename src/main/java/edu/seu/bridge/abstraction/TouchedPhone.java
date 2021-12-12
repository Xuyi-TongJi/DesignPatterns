package edu.seu.bridge.abstraction;

import edu.seu.bridge.implementation.Brand;

public class TouchedPhone extends Phone{

    public TouchedPhone(Brand brand) {
        super(brand);
    }

    public void open() {
        super.open();
        System.out.println("打开直立样式手机");
    }

    public void close() {
        super.open();
        System.out.println("关闭直立样式手机");
    }

    public void call() {
        super.open();
        System.out.println("直立样式手机通话");
    }
}
