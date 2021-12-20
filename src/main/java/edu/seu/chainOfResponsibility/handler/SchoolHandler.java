package edu.seu.chainOfResponsibility.handler;

import edu.seu.chainOfResponsibility.request.PurchaseRequest;

public class SchoolHandler extends Handler{

    public SchoolHandler(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        // 校长能处理所有请求
        System.out.println(request.getId() + "," + this.name + "已处理");
    }
}