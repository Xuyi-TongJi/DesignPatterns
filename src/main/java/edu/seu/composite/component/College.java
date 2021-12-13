package edu.seu.composite.component;

import edu.seu.composite.OrganizationComponent;

import java.util.ArrayList;
import java.util.List;

// College类，管理Department
public class College extends OrganizationComponent {

    // 组合一个ArrayList管理子节点
    List<OrganizationComponent> organizationComponents
            = new ArrayList<>();

    public College(String name, String des) {
        super(name, des);
    }

    // 各个Component在添加和删除系时可能有不同的业务逻辑
    @Override
    protected void add(OrganizationComponent oc) {
        organizationComponents.add(oc);
    }

    @Override
    protected void remove(OrganizationComponent oc) {
        organizationComponents.remove(oc);
    }

    @Override
    public void print() {
        System.out.println("------" + this.getName() + "------");
        // 输出University中包含的学院
        for (OrganizationComponent oc:
                organizationComponents) {
            oc.print();
        }
    }
}
