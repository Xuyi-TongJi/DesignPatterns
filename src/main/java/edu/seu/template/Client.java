package edu.seu.template;

import edu.seu.template.impl.PeanutSoya;
import edu.seu.template.impl.PureSoya;

public class Client {
    public static void main(String[] args) {
        AbstractSoyaMilk peanutSoya = new PeanutSoya();
        peanutSoya.make();
        AbstractSoyaMilk pureSoya = new PureSoya();
        pureSoya.make();
    }
}