package edu.seu.principle.dependenceInversionPrinciple;

public class DependencyInversion1 {
    public static void main(String[] args) {
        new Person().receive(new Email());
    }
}

class Email {
    public String getInfo() {
        return "电子邮件信息: Hello, World";
    }
}

// 完成Person接收消息的功能
// 方式1分析
// 简单，比较容易实现想到
// 缺陷：如果我们获取的对象是微信，短信等等，则要新增一个类，同时Person也要增加相应的接收方法(扩展性差）
// 解决思路：引入一个抽象的接口IReceiver，Person类与这个接口发生依赖。Email，WeChat都属于接收的范围，各自实现IReceiver接口就可以
class Person {
    public void receive(Email email){
        System.out.println(email.getInfo());
    }
}