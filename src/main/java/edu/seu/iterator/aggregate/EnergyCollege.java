package edu.seu.iterator.aggregate;

import edu.seu.iterator.concreteIterator.EnergyCollegeIterator;
import edu.seu.iterator.element.Department;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EnergyCollege implements College{

    private final List<Department> departmentList;

    public EnergyCollege() {
        this.departmentList = new ArrayList<>();
        addDepartment(new Department("工程热物理", "080700"));
        addDepartment(new Department("动力工程", "085900"));
    }

    @Override
    public String getName() {
        return "能源与动力工程系";
    }

    @Override
    public void addDepartment(Department department) {
        departmentList.add(department);
    }

    @Override
    public Iterator<Department> createIterator() {
        return new EnergyCollegeIterator(departmentList);
    }
}
