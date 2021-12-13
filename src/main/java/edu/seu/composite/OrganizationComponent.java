package edu.seu.composite;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
// 要增加叶子节点(leaf)或非叶子节点(Component)，直接继承该类
public abstract class OrganizationComponent {

    private String name;
    private String des;

    protected void add(OrganizationComponent oc) {
        // 默认实现
        // 不建议写成抽象方法，因为叶子节点不用重写该方法
        throw new UnsupportedOperationException("不支持该操作");
    }

    protected void remove(OrganizationComponent oc) {
        throw new UnsupportedOperationException("不支持该操作");
    }

    // 所有叶子与非叶子结点都要实现
    public abstract void print();
}
