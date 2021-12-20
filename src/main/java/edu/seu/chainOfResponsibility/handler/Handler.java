package edu.seu.chainOfResponsibility.handler;

import edu.seu.chainOfResponsibility.request.PurchaseRequest;

public abstract class Handler {

    protected Handler nextHandler; // 责任链中的下一个处理者
    protected final String name;

    public Handler(String name) {
        this.name = name;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    /**
     * 处理一个请求
     * @param request 被处理的请求
     */
    public abstract void processRequest(PurchaseRequest request);
}
