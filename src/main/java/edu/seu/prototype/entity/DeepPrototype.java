package edu.seu.prototype.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.io.*;
import java.util.Objects;

// 深拷贝
@Data
@AllArgsConstructor
@ToString
public class DeepPrototype implements Serializable, Cloneable {

    private String name;
    private DeepCloneableTarget target; // 引用类型属性
    public DeepPrototype() {
        super();
    }

    // 深拷贝 - 方式1 使用clone
    // 调用getter和setter
    @Override
    public Object clone() throws CloneNotSupportedException {
        Object deep = null;
        // 完成对基本数据类型属性和String的克隆
        deep = super.clone();
        // 对引用类型的属性进行单独处理, clone一份target，借用getter和setter
        DeepCloneableTarget newTarget
                = (DeepCloneableTarget) target.clone();
        ((DeepPrototype) deep).setTarget(newTarget);
        return deep;
    }

    // 深拷贝 - 方式2 使用对象的序列化(推荐)
    // 如果有多种引用类型成员变量，该方法可以通过拷贝整体对象的方式实现深拷贝
    public Object deepClone() {
        // 创建流对象
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        DeepPrototype copyObj = null;

        try{
            // 序列化 --> 输出/写
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this); // 将当前对象以对象流的形式输出

            // 反序列化 --> 输入/读
            bis = new ByteArrayInputStream(bos.toByteArray()); // 读入bos输出的字节流
            ois = new ObjectInputStream(bis);
            copyObj = (DeepPrototype) ois.readObject();
        } catch (Exception e1) {
            e1.printStackTrace();
        } finally {
            try {
                Objects.requireNonNull(bos).close();
                Objects.requireNonNull(oos).close();
                Objects.requireNonNull(bis).close();
                Objects.requireNonNull(ois).close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return copyObj;
    }
}
