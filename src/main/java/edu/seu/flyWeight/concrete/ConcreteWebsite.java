package edu.seu.flyWeight.concrete;

import edu.seu.flyWeight.User;
import edu.seu.flyWeight.Website;

public class ConcreteWebsite extends Website {

    private String type = ""; // 网站发布的形式（内部状态）

    public ConcreteWebsite(String type) {
        this.type = type;
    }

    // user为外部状态
    @Override
    public void use(User user) {
        System.out.println("网站发布形式为:" + type);
        System.out.println("使用者是" + user.getName());
    }
}
