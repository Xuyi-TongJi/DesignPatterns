package edu.seu.singleton.type8;

// 枚举实现单例模式
// 可以避免多线程同步问题，还可以防止反序列化创建新的对象
// 推荐使用
public class Enum {
    public static void main(String[] args) {
        Singleton8 instance1 = Singleton8.INSTANCE;
        Singleton8 instance2 = Singleton8.INSTANCE;
        System.out.println(instance1 == instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
        instance1.sayOK();
    }
}

enum Singleton8 {
    INSTANCE;  // 只有一个属性，就保证了单例
    public void sayOK() {
        System.out.println("ok");
    }
}
