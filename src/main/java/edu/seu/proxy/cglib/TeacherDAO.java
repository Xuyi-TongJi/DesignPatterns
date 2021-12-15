package edu.seu.proxy.cglib;

public class TeacherDAO {

    public void teach() {
        System.out.println("我是cglib代理，不需要实现接口，但我不能是final类");
    }
}
