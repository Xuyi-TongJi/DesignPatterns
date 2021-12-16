package edu.seu.visitor.element;

import edu.seu.visitor.visitor.Action;

public class Man extends Person{

    public Man(String name) {
        super(name);
    }

    @Override
    public void accept(Action action) {
        action.getManResult(this);
    }
}
