package edu.seu.interpreter.expression;

/**
 * 抽象运算符号解析器
 * 1.每个运算符号都只与自己左右两个数字有关系
 * 2.left和right可能是某VarExpression，也可能是某解析的结果，其二者都是AbstractExpression的子类
 */
public abstract class SymbolExpression extends AbstractExpression {

    protected AbstractExpression left;
    protected AbstractExpression right;

    public SymbolExpression(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    // SymbolExpression是让其子类来实现，因此interpret抽象方法不实现
}