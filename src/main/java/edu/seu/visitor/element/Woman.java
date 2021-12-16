package edu.seu.visitor.element;

import edu.seu.visitor.visitor.Action;

public class Woman extends Person{

    public Woman(String name) {
        super(name);
    }

    @Override
    public void accept(Action action) {
        action.getWomanResult(this);
    }
}

