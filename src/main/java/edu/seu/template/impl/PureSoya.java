package edu.seu.template.impl;

import edu.seu.template.AbstractSoyaMilk;

public class PureSoya extends AbstractSoyaMilk {

    @Override
    protected void addBurdening() {

    }

    @Override
    protected boolean needBurdening() {
        return false;
    }
}
