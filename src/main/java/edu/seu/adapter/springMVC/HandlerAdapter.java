package edu.seu.adapter.springMVC;

// 定义一个Handler(Controller)适配器HandlerAdapter接口
public interface HandlerAdapter {

    // 判断当前适配器是否支持handler
    boolean supports(Object handler);
    // 执行适配器中的方法
    void handle(Object handler);
}

// 多种适配器类
class SimpleHandlerAdapter implements HandlerAdapter {

    @Override
    public boolean supports(Object handler) {
        return (handler instanceof SimpleController);
    }

    @Override
    public void handle(Object handler) {
        ((SimpleController) handler).doSimpleController();
    }
}

class HttpHandlerAdapter implements HandlerAdapter {

    @Override
    public boolean supports(Object handler) {
        return (handler instanceof HttpController);
    }

    @Override
    public void handle(Object handler) {
        ((HttpController) handler).doHttpHandler();
    }
}

class AnnotationHandlerAdapter implements HandlerAdapter {

    @Override
    public boolean supports(Object handler) {
        return (handler instanceof AnnotationController);
    }

    @Override
    public void handle(Object handler) {
        ((AnnotationController) handler).doAnnotationController();
    }
}


