package edu.seu.singleton.type1;

// 饿汉式单例模式
// 使用静态成员变量完成

// 优点：较为简单；类加载时就完成了实例化。避免多线程同步问题。
// 缺点：没有达到Lazy Loading的效果。如果从始至终未使用这个类的实例，则会造成内存的浪费
public class HungryType1 {
    public static void main(String[] args) {
        Singleton1 instance1 = Singleton1.getInstance();
        Singleton1 instance2 = Singleton1.getInstance();
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}

class Singleton1 {

    // 构造器私有化，外部不能new
    private Singleton1() {

    }

    // 在本类内部创建对象实例
    private final static Singleton1 instance = new Singleton1();

    // 提供一个公有的静态方法，返回实例对象
    public static Singleton1 getInstance() {
        return instance;
    }
}


