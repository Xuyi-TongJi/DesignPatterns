package edu.seu.proxy;

import edu.seu.proxy.dynamicProxy.ProxyFactory;
import edu.seu.proxy.staticProxy.TeacherDAO;
import edu.seu.proxy.staticProxy.TeacherDAOProxy;

public class Client {
    public static void main(String[] args) {
        staticProxy();
        System.out.println("---------");
        dynamicProxy();
        System.out.println("---------");
        cglibProxy();
    }

    // 静态代理
    public static void staticProxy() {
        ITeacherDAO teacherDAO = new TeacherDAO();
        ITeacherDAO teacherDAOProxy = new TeacherDAOProxy(teacherDAO);
        teacherDAOProxy.teach();
    }

    // jdk代理
    public static void dynamicProxy() {
        ITeacherDAO target = new TeacherDAO();
        ITeacherDAO proxyInstance = (ITeacherDAO) new ProxyFactory(target).getProxyInstance();
        System.out.println(proxyInstance.getClass());
        proxyInstance.teach();
    }

    // cglib代理
    public static void cglibProxy() {
        edu.seu.proxy.cglib.ProxyFactory proxyFactory
                = new edu.seu.proxy.cglib.ProxyFactory(new edu.seu.proxy.cglib.TeacherDAO());
        edu.seu.proxy.cglib.TeacherDAO proxyInstance
                = (edu.seu.proxy.cglib.TeacherDAO)(proxyFactory.getProxyInstance());
        proxyInstance.teach();
    }
}
