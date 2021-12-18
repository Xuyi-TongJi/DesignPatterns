package edu.seu.iterator.output;

import edu.seu.iterator.element.Department;
import edu.seu.iterator.aggregate.College;

import java.util.Iterator;
import java.util.List;

/**
 *  完成对所有学院的输出
 */
public class OutputImpl {
    // 学院集合
    private final List<College> collegeList;

    public OutputImpl(List<College> collegeList) {
        this.collegeList = collegeList;
    }

    // 学院输出系
    protected void printDepartment(Iterator<Department> iterator) {
        while (iterator.hasNext()) {
            Department next = iterator.next();
            System.out.println(next.getName() + "---" + next.getDescription());
        }
    }

    // 遍历所有学院，然后调用printDepartment
    public void printCollege() {
        // ArrayList是jdk中的类，已经实现了Iterator接口（中的iterator方法）
        for (College e:
             collegeList) {
            System.out.println(e.getName());
            printDepartment(e.createIterator());
            System.out.println("---------------");
        }
    }
}