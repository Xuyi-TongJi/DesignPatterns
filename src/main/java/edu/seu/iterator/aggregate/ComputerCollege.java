package edu.seu.iterator.aggregate;

import edu.seu.iterator.concreteIterator.ComputerCollegeIterator;
import edu.seu.iterator.element.Department;

import java.util.Iterator;

public class ComputerCollege implements College{

    private final Department[] departments;
    private int num = 0;

    public ComputerCollege() {
        this.departments = new Department[4];
        addDepartment(new Department("java", "Java"));
        addDepartment(new Department("php", "PHP"));
        addDepartment(new Department("cs", "Computer Science"));
        addDepartment(new Department("se", "Software Engineering"));
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(Department department) {
        departments[num] = department;
        num ++;
    }

    /**
     * 获得当前College的迭代器
     * @return 迭代器
     */
    @Override
    public Iterator<Department> createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
