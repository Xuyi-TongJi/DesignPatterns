package edu.seu.principle.InterfaceSegregationPrinciple;

public class Segregation2 {
    public static void main(String[] args) {
        A1 a1 = new A1();
        a1.method1(new B1());
        C1 c1 = new C1();
        c1.method4(new D1());
    }
}

// 将Interface拆分成三个类，以遵循接口隔离原则
interface Interface1{
    void operation1();
}

interface Interface2{
    void operation2();
    void operation3();
}

interface Interface3{
    void operation4();
    void operation5();
}

class B1 implements Interface1, Interface2{
    @Override
    public void operation1() {
        System.out.println("operation1");
    }

    @Override
    public void operation2() {
        System.out.println("operation2");
    }

    @Override
    public void operation3() {
        System.out.println("operation3");
    }
}

class D1 implements Interface1, Interface3 {
    @Override
    public void operation1() {
        System.out.println("operation1");
    }

    @Override
    public void operation4() {
        System.out.println("operation4");
    }

    @Override
    public void operation5() {
        System.out.println("operation5");
    }
}

class A1{
    public void method1(Interface1 i){
        i.operation1();
    }
    
    public void method2(Interface2 i){
        i.operation2();
    }
    
    public void method3(Interface2 i){
        i.operation3();
    }
}

class C1{
    public void method1(Interface1 i){
        i.operation1();
    }
    
    public void method4(Interface3 i){
        i.operation4();
    }

    public void method5(Interface3 i){
        i.operation5();
    }
}
