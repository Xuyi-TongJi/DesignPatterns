package edu.seu.interpreter.expression;

import java.util.Map;

public class SubExpression extends SymbolExpression{

    public SubExpression(AbstractExpression left, AbstractExpression right) {
        super(left, right);
    }

    @Override
    public int interpret(Map<String, Integer> var) {
        return super.left.interpret(var) - super.right.interpret(var);
    }
}