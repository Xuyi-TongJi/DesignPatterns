package edu.seu.visitor.visitor;

import edu.seu.visitor.element.Man;
import edu.seu.visitor.element.Woman;

public class Failure extends Action{
    @Override
    public void getManResult(Man man) {
        System.out.println(man.getName() + "给出的评价是很失败");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println(woman.getName() + "女人给出的评价是很失败");
    }
}
