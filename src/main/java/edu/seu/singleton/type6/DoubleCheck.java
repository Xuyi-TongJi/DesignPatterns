package edu.seu.singleton.type6;

// 懒汉式单例模式
// 双重检查
// 同时解决懒加载和线程安全问题
public class DoubleCheck {
    public static void main(String[] args) {
        new Thread(() -> {
            Singleton6 instance = Singleton6.getInstance();
            System.out.println(instance.hashCode());
        }).start();
        new Thread(() -> {
            Singleton6 instance = Singleton6.getInstance();
            System.out.println(instance.hashCode());
        }).start();
    }
}

class Singleton6 {

    private static volatile Singleton6 instance; // 修改值立即更新到主存

    private Singleton6() {}

    public static Singleton6 getInstance() {
        if (instance == null) {
            synchronized (Singleton6.class) {
                if (instance  == null) {
                    instance = new Singleton6();
                }
            }
        }
        return instance;
    }
}
