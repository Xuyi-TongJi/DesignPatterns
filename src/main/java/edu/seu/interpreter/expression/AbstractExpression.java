package edu.seu.interpreter.expression;

import java.util.Map;

public abstract class AbstractExpression {

    // 解释公式和数值，key就是公式（表达式），参数[a,b,c], value是具体的值[10, 20, 30]
    // a = 10, b = 20, c = 30
    public abstract int interpret(Map<String, Integer> var);
}