package edu.seu.interpreter.expression;

import java.util.Map;

public class AddExpression extends SymbolExpression{

    public AddExpression(AbstractExpression left, AbstractExpression right) {
        super(left, right);
    }

    // 处理相加逻辑
    @Override
    public int interpret(Map<String, Integer> var) {
        return super.left.interpret(var) + super.right.interpret(var);
    }
}