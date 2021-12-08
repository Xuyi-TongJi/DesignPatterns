package edu.seu.principle.openClosePrinciple;

public class OcpImprove {

}

// 解决方案
// 使用方代码不改变
// 在依赖倒转时，也用相似的方法实现
class GraphicEditorImprove {
    public void draw(AbstractShape r) {
        r.draw();
    }
}

// Shape类，基类
abstract class AbstractShape {
    abstract public void draw();
}

class Rectangle2 extends AbstractShape {

    @Override
    public void draw() {
        System.out.println("绘制矩形");
    }
}

class Circle2 extends AbstractShape {

    @Override
    public void draw() {
        System.out.println("绘制圆形");
    }
}

// 新增三角形
class Triangle2 extends AbstractShape {

    @Override
    public void draw() {
        System.out.println("绘制三角形");
    }
}