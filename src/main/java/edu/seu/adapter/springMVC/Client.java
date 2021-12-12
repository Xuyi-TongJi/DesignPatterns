package edu.seu.adapter.springMVC;

public class Client {
    public static void main(String[] args) {
        DispatcherServlet dispatcherServlet = new DispatcherServlet();
        dispatcherServlet.doDispatch(new AnnotationController());
    }
}