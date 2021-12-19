package edu.seu.interpreter.expression;

import java.util.Map;

public class VarExpression extends AbstractExpression{

    private final String key; // key = 'a', key = 'b', key = 'c' 构造时赋值

    public VarExpression(String key) {
        this.key = key;
    }

    /**
     * find the value of 'key' when constructing in variable Map
     * @param var variable Map
     * @return the value of key of this varExpression
     */
    @Override
    public int interpret(Map<String, Integer> var) {
        return var.get(key);
    }
}