package edu.seu.iterator.aggregate;

import edu.seu.iterator.element.Department;

import java.util.Iterator;

/**
 * 返回一个迭代器
 */
public interface College {

    public String getName();

    public void addDepartment(Department department);

    public Iterator<Department> createIterator();
}
