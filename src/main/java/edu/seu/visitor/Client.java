package edu.seu.visitor;

import edu.seu.visitor.element.Man;
import edu.seu.visitor.element.Woman;
import edu.seu.visitor.elementDataStructure.ObjectStructure;
import edu.seu.visitor.visitor.Failure;
import edu.seu.visitor.visitor.Wait;

public class Client {
    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.attach(new Man("sl"));
        objectStructure.attach(new Woman("zfy"));
        objectStructure.display(new Failure());

        ObjectStructure objectStructure1 = new ObjectStructure();
        objectStructure1.attach(new Man("xy"));
        objectStructure1.attach(new Woman("zzz"));
        objectStructure1.display(new Wait());
    }
}
