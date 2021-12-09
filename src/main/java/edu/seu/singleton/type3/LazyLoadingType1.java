package edu.seu.singleton.type3;

// 懒汉式单例模式
// 线程不安全

// 优点：能够起到懒加载的效果
// 缺点：在多线程下，一个线程进入到if判断块，此时发生了context switch，此时会产生多个实例
// 在实际开发中，不能使用这种方式，因为会破坏单例模式的初衷
public class LazyLoadingType1 {
    public static void main(String[] args) {
        Singleton3 instance1 = Singleton3.getInstance();
        Singleton3 instance2 = Singleton3.getInstance();
        System.out.println(instance1 == instance2);
    }
}

class Singleton3 {

    private static Singleton3 instance;

    private Singleton3() {}

    // 提供一个静态的公有方法，当使用该方法时，才去创建instance
    public static Singleton3 getInstance(){
        if (instance == null) {
            instance = new Singleton3();
        }
        return instance;
    }
}
