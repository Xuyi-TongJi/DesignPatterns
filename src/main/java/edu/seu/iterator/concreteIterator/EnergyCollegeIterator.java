package edu.seu.iterator.concreteIterator;

import edu.seu.iterator.element.Department;

import java.util.Iterator;
import java.util.List;

public class EnergyCollegeIterator implements Iterator<Department> {

    private final List<Department> departmentList;
    private int index = -1;

    public EnergyCollegeIterator(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    @Override
    public boolean hasNext() {
        if (index >= departmentList.size() - 1) {
            return false;
        } else {
            index ++;
            return true;
        }
    }

    @Override
    public Department next() {
        return departmentList.get(index);
    }

    @Override
    public void remove() {
    }
}
