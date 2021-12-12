package edu.seu.bridge.abstraction;

import edu.seu.bridge.implementation.Brand;

public abstract class Phone {

    // 组合抽象层
    private Brand brand;

    // 通过构造器组合,无无参构造
    public Phone(Brand brand) {
        this.brand = brand;
    }

    public void open() {
        this.brand.open();
    }

    public void close() {
        this.brand.close();
    }

    public void call() {
        this.brand.call();
    }
}
