package edu.seu.visitor.visitor;

import edu.seu.visitor.element.Man;
import edu.seu.visitor.element.Woman;

// 新增一个Action(Visitor)
public class Wait extends Action{
    @Override
    public void getManResult(Man man) {
        System.out.println(man.getName() + "给出的结果是待定");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println(woman.getName() + "给出的结果是待定");
    }
}
