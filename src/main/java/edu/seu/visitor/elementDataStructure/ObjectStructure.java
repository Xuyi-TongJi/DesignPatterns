package edu.seu.visitor.elementDataStructure;

import edu.seu.visitor.element.Person;
import edu.seu.visitor.visitor.Action;

import java.util.LinkedList;
import java.util.List;

// Person数据结构，管理了Person类
public class ObjectStructure {

    private final List<Person> persons = new LinkedList<>();

    public void attach(Person p) {
        persons.add(p);
    }

    public void detach(Person p) {
        persons.remove(p);
    }

    /**
     *  高层接口，允许Visitor访问
     *  现实测评的情况
     *  @Params action 依赖Visitor
     */
    public void display(Action action) {
        for (Person p: this.persons) {
            p.accept(action);
        }
    }
}
