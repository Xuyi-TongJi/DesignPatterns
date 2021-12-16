package edu.seu.visitor.visitor;

import edu.seu.visitor.element.Man;
import edu.seu.visitor.element.Woman;

public abstract class Action {

    public abstract void getManResult(Man man);

    public abstract void getWomanResult(Woman woman);
}
