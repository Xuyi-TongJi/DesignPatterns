package edu.seu.singleton.type4;

// 懒汉式单例模式
// 同步方法实现

// 优点：解决了懒汉式单例模式的线程不安全问题
// 缺点：效率太低。每个线程想获得类的实例时，每次执行getInstance方法都要加锁。并且，只需要在创建实例时加锁，就可以完成功能需求。
// 实际开发中不推荐使用
public class LazyLoadingType2 {
}

class Singleton4 {

    private static Singleton4 instance;

    private Singleton4() {}

    // 加入了同步方法，解决线程不安全问题。静态方法在Class类对象加锁
    public static synchronized Singleton4 getInstance() {
        if (instance == null) {
            instance = new Singleton4();
        }
        return instance;
    }
}