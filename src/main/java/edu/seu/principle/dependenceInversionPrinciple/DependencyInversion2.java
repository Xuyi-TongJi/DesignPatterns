package edu.seu.principle.dependenceInversionPrinciple;

public class DependencyInversion2 {
    public static void main(String[] args) {
        new IPerson().receive(new IWechat());
    }
}

// 使用依赖倒转原则对Person的receive功能进行改进
// 1 接口传递依赖
// 2 构造方法传递
// 3 setter方式传递

interface IReceiver {
    String getInfo();
}

class IEmail implements IReceiver{

    @Override
    public String getInfo() {
        return "Hello,World";
    }
}

class IWechat implements IReceiver{

    @Override
    public String getInfo() {
        return "Hello, WeChat";
    }
}

class IPerson{
    public void receive(IReceiver iReceiver){
        String info = iReceiver.getInfo();
        System.out.println(info);
    }
}
