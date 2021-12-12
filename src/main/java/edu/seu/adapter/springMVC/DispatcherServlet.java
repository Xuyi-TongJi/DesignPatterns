package edu.seu.adapter.springMVC;

import java.util.ArrayList;
import java.util.List;

public class DispatcherServlet {

    public static List<HandlerAdapter> handlerAdapters = new ArrayList<>();

    public DispatcherServlet() {
        handlerAdapters.add(new AnnotationHandlerAdapter());
        handlerAdapters.add(new HttpHandlerAdapter());
        handlerAdapters.add(new SimpleHandlerAdapter());
    }

    // 通过适配器，将原本三个不兼容的Controller接口，融合在DispatcherServlet.doDisPatch()方法中执行
    public void doDispatch(Controller handler) {
        // 获得相应适配器
        HandlerAdapter handlerAdapter = getHandlerAdapter(handler);
        // 适配器执行Controller中的目标方法
        handlerAdapter.handle(handler);
    }

    public HandlerAdapter getHandlerAdapter(Controller handler) {
        HandlerAdapter handlerAdapter = null;
        for (HandlerAdapter ha : handlerAdapters) {
            if (ha.supports(handler)) {
                handlerAdapter = ha;
                break;
            }
        }
        return handlerAdapter;
    }
}
