package edu.seu.template.impl;

import edu.seu.template.AbstractSoyaMilk;

public class PeanutSoya extends AbstractSoyaMilk {
    @Override
    protected void addBurdening() {
        System.out.println("2. 加入花生");
    }
}
