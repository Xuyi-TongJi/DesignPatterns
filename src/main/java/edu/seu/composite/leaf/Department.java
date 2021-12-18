package edu.seu.composite.leaf;

import edu.seu.composite.OrganizationComponent;

public class Department extends OrganizationComponent {

    public Department(String name, String des) {
        super(name, des);
    }

    // 无需重写add和remove方法，因为它是叶子结点，不用管理其他单位

    @Override
    public void print() {
        System.out.println(this.getName() + "   " + this.getDes());
    }
}