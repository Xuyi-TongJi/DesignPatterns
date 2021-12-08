package edu.seu.principle.liskovPrinciple;

public class LisKovPrincipleImprove {
    public static void main(String[] args) {
        A2 a = new A2();
        System.out.println(a.fun1(11, 8));
        B2 b = new B2();
        // 因为B不再继承A类，因此调用者不会再以为以为fun1是求减法
        // 使用组合(或聚合，依赖)依旧可以使用A的相关方法
        System.out.println("11 - 8 = " + b.fun3(11, 8));
    }
}

abstract class Base {
    public abstract int fun1(int a, int b);
}

class A2 extends Base {

    @Override
    public int fun1(int a, int b) {
        return a - b;
    }
}

class B2 extends Base {
    // 如果B需要使用A中的方法，可以使用组合关系
    private final A a = new A();

    @Override
    public int fun1(int a, int b) {
        return a + b;
    }

    public int fun2(int a, int b){
        return fun1(a, b) + 9;
    }

    // 如果仍然想用A的方法
    public int fun3(int a, int b) {
        return this.a.fun1(a, b);
    }
}