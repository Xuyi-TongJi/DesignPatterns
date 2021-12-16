package edu.seu.visitor.element;

import edu.seu.visitor.visitor.Action;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Person {

    private final String name;
    // 提供一个接口，让访问者可以访问
    public abstract void accept(Action action);
}
