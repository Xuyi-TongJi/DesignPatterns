package edu.seu.chainOfResponsibility.handler;

import edu.seu.chainOfResponsibility.request.PurchaseRequest;

public class DepartmentHandler extends Handler{

    public DepartmentHandler(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getPrice() <= 5000) {
            System.out.println(request.getId() + "," + this.name + "已处理");
        } else {
            // 自己不能处理，交给下一个Handler
            nextHandler.processRequest(request);
        }
    }
}
