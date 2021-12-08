package edu.seu.principle.InterfaceSegregationPrinciple;

public class Segregation1 {
    public static void main(String[] args) {

    }
}

interface Interface{
    void operation1();
    void operation2();
    void operation3();
    void operation4();
    void operation5();
}

class B implements Interface{

    @Override
    public void operation1() {
        System.out.println("B implements 1");
    }

    @Override
    public void operation2() {
        System.out.println("B implements 2");
    }

    @Override
    public void operation3() {
        System.out.println("B implements 3");
    }

    @Override
    public void operation4() {
        System.out.println("B implements 4");
    }

    @Override
    public void operation5() {
        System.out.println("B implements 5");
    }
}

class A{ // A类通过接口使用B类，但是只会用到1，2，3方法
    public void depend1(Interface i){
        i.operation1();
    }
    public void depend2(Interface i){
        i.operation2();
    }
    public void depend3(Interface i){
        i.operation3();
    }
}

class C{ // C类通过接口使用B类，但是只会用到1，4，5方法
    public void depend1(Interface i){
        i.operation1();
    }
    public void depend4(Interface i){
        i.operation4();
    }
    public void depend5(Interface i){
        i.operation5();
    }
}