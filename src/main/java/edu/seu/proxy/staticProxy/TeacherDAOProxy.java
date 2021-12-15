package edu.seu.proxy.staticProxy;

import edu.seu.proxy.ITeacherDAO;

// 代理对象（静态代理）
// 和目标对象实现相同的接口
public class TeacherDAOProxy implements ITeacherDAO {

    private final ITeacherDAO target; // 被代理对象(目标对象)，通过接口成员变量组合

    public TeacherDAOProxy(ITeacherDAO target) {
        this.target = target;
    }

    @Override
    public void teach() {
        System.out.println("开始代理");  // 增加功能
        target.teach();
        System.out.println("代理结束");  // 增加功能
    }
}
