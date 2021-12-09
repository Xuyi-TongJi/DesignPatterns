package edu.seu.singleton.type2;

// 饿汉式单例模式
// 静态代码块实现
// 优缺点同静态常量
public class HungryType2 {
    public static void main(String[] args) {
        Singleton2 instance1 = Singleton2.getInstance();
        Singleton2 instance2 = Singleton2.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}

class Singleton2 {

    private Singleton2() {

    }

    private static final Singleton2 instance;

    static {
        instance = new Singleton2();
    }

    public static Singleton2 getInstance() {
        return instance;
    }
}
