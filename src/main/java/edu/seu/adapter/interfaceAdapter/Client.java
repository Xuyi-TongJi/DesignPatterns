package edu.seu.adapter.interfaceAdapter;

public class Client {
    public static void main(String[] args) {
        new AbsAdapter() {
            // 只需要去覆盖我们需要使用的接口方法
            @Override
            public void method01() {
                System.out.println("使用了m1的方法");
            }
        }.method01();

        // 如果直接new MyInterface，必须全部重写所有接口方法
    }
}
