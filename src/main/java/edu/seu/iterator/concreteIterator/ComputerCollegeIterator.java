package edu.seu.iterator.concreteIterator;

import edu.seu.iterator.element.Department;

import java.util.Iterator;

public class ComputerCollegeIterator implements Iterator<Department> {

    // 需要知道Department以什么方式存放

    private final Department[] departments;

    private int position = 0;

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    /**
     * 判断是否还有下一个元素
     *
     * @return boolean
     */
    @Override
    public boolean hasNext() {
        return position < departments.length &&
                departments[position] != null;
    }

    /**
     * 获得下一个元素
     *
     * @return next Element
     */
    @Override
    public Department next() {
        Department department = departments[position];
        position ++;
        return department;
    }
}