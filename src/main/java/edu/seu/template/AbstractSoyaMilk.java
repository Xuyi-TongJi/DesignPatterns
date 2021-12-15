package edu.seu.template;

// 模版类
public abstract class AbstractSoyaMilk {

    // 模版方法
    // final 子类不能覆盖
    public final void make() {
        select();
        if (needBurdening()) {
            addBurdening();
        }
        soak();
        beat();
    }

    protected void select() {
        System.out.println("1. 选择好的新鲜黄豆");
    }

    protected abstract void addBurdening();

    protected void soak() {
        System.out.println("3. 浸泡3小时");
    }

    protected void beat() {
        System.out.println("4. 黄豆和配料放到豆浆机");
    }

    protected boolean needBurdening() {
        return true;
    }
}
