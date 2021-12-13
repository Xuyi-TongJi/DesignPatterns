package edu.seu.composite;

import edu.seu.composite.component.College;
import edu.seu.composite.component.University;
import edu.seu.composite.leaf.Department;

public class Client {
    public static void main(String[] args) {
        OrganizationComponent university = new University("清华大学", "中国顶级大学");
        OrganizationComponent college1 = new College("计算机学院", "夺命912");
        OrganizationComponent college2 = new College("能源与动力工程系", "呵呵");
        OrganizationComponent cs = new Department("计算机科学与技术", "912");
        OrganizationComponent se = new Department("软件工程", "hello_world");
        OrganizationComponent td = new Department("热能工程", "王牌专业");
        OrganizationComponent nt = new Department("暖通", "呵呵呵呵");
        college1.add(cs);
        college1.add(se);
        college2.add(td);
        college2.add(nt);
        university.add(college1);
        university.add(college2);
        university.print();
    }
}
