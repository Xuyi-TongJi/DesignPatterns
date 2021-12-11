package edu.seu.prototype.entity;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
public class DeepCloneableTarget implements Serializable, Cloneable {

    private String cloneName;
    private String cloneClass;

    // Constructor
    public DeepCloneableTarget(String cloneName, String cloneClass) {
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }

    // 该类的属性都是String，因此这里可以使用默认的克隆方法完成即可（浅拷贝）
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
