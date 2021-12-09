package edu.seu.singleton.type5;

// 懒汉式单例模式
// 同步代码块解决线程不安全问题

// 这种方法无法解决线程安全问题，在实际开发中也无法使用
// 解决线程安全问题，一般使用双重校验
public class LazyLoadingType3 {
    public static void main(String[] args) {
        new Thread(() -> {
            Singleton5 instance = Singleton5.getInstance();
            System.out.println(instance.hashCode());  // 510565305
        }).start();
        new Thread(() -> {
            Singleton5 instance = Singleton5.getInstance();
            System.out.println(instance.hashCode());  // 448689266 实例化了两个instance
        }).start();
    }
}

class Singleton5 {

    private static Singleton5 instance;

    private Singleton5() {

    }

    public static Singleton5 getInstance() {
        if (instance == null) {
            // 在执行判断逻辑时，可能多个线程已经进入了if逻辑块
            // 此时，即使加了synchronized代码块，多个已经进入if块的线程依旧会同步执行instance = new Singleton()
            // 因此，这种方式无法解决线程安全问题，必须使用双重校验代替
            synchronized (Singleton5.class) {
                instance = new Singleton5();
            }
        }
        return instance;
    }
}
