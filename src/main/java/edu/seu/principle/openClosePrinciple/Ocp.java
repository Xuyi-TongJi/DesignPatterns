package edu.seu.principle.openClosePrinciple;

public class Ocp {
    // 优点：简单易操作
    // 缺点：违反了ocp原则，即对扩展开放（提供方），对修改关闭（使用方）
    // 如果新增三角形类，则需要修改使用方代码（GraphicEditor），违反ocp原则
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Rectangle());
    }
}

// 一个用于绘图的类【使用方】
class GraphicEditor {
    // 接收Shape对象，然后根据type来绘制不同的图形
    public void drawShape(Shape r) {
        if (r.m_type == 1){
            drawRectangle();
        } else if (r.m_type == 2) {
            drawCircle();
        }
    }

    public void drawRectangle() {
        System.out.println("矩形");
    }

    public void drawCircle() {
        System.out.println("圆形");
    }
}

// Shape类，基类
class Shape {
    int m_type;
}

class Rectangle extends Shape {
    public Rectangle() {
        super.m_type = 1;
    }
}

class Circle extends Shape {
    public Circle() {
        super.m_type = 2;
    }
}