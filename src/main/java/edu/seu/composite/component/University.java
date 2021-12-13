package edu.seu.composite.component;

import edu.seu.composite.OrganizationComponent;

import java.util.ArrayList;
import java.util.List;

// 该类为组件Composite，可以管理College(非叶子节点)
public class University extends OrganizationComponent {

    // 组合一个ArrayList管理子节点
    List<OrganizationComponent> organizationComponents
            = new ArrayList<>();

    public University(String name, String des) {
        super(name, des);
    }

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