package edu.seu.chainOfResponsibility;

import edu.seu.chainOfResponsibility.handler.CollegeHandler;
import edu.seu.chainOfResponsibility.handler.DepartmentHandler;
import edu.seu.chainOfResponsibility.handler.Handler;
import edu.seu.chainOfResponsibility.handler.SchoolHandler;
import edu.seu.chainOfResponsibility.request.PurchaseRequest;

public class Client {
    public static void main(String[] args) {
        PurchaseRequest purchaseRequest = new PurchaseRequest( 1000f, 10);
        PurchaseRequest purchaseRequest1 = new PurchaseRequest(100000f, 11);
        PurchaseRequest purchaseRequest2 = new PurchaseRequest(7500f, 12);

        Handler departmentHandler = new DepartmentHandler("departmentHandler");
        Handler collegeHandler = new CollegeHandler("collegeHandler");
        Handler schoolHandler = new SchoolHandler("schoolHandler");

        // 构成责任链
        departmentHandler.setNextHandler(collegeHandler);
        collegeHandler.setNextHandler(schoolHandler);
        // 在非包含型职责链时（如：当校长不能处理10000元以下请求时），为防止空指针异常，必须使责任链形成环路
        schoolHandler.setNextHandler(departmentHandler);

        // 处理请求
        departmentHandler.processRequest(purchaseRequest);
        departmentHandler.processRequest(purchaseRequest1);
        departmentHandler.processRequest(purchaseRequest2);
    }
}