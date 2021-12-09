package edu.seu.singleton.type7;

// 静态内部类实现懒加载单例模式
/* 静态内部类的特点：
    1 外部类Singleton7被加载时，静态内部类SingletonInstance不会被加载
    2 当我们调用getInstance()方法时会导致静态内部类的加载，并且只会加载一次
    3 jvm在类加载时，线程安全
    4 该方式可以实现懒加载
 */
public class StaticInnerClass {
}

class Singleton7 {

    private Singleton7() {}

    // 静态内部类
    private static class SingletonInstance {
        // 成员变量
        private static final Singleton7 INSTANCE = new Singleton7();
    }

    public static Singleton7 getInstance() {
        return SingletonInstance.INSTANCE;
    }
}
