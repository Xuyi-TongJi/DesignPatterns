package edu.seu.principle.liskovPrinciple;

public class LisKovPrinciple {
    public static void main(String[] args){
        A a = new A();
        System.out.println(a.fun1(11, 8));
        B b = new B();
        // 重写父类方法使得整个体系的复用性比较差，特别是运行多态比较频繁的场合
        System.out.println("11 - 8 = " + b.fun1(11, 8));
    }
}

class A {
    public int fun1(int num1, int num2){
        return num1 - num2;
    }
}

class B extends A{
    // B重写父类方法
    @Override
    public int fun1(int num1, int num2) {
        return num1 + num2;
    }

    public int fun2(int num1, int num2) {
        return fun1(num1, num2) + 9;
    }
}