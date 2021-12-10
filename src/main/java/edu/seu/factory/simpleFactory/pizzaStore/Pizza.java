package edu.seu.factory.simpleFactory.pizzaStore;

import lombok.Data;

@Data
public abstract class Pizza {

    protected String name;

    public abstract void prepare();

    public  void bake(){
        System.out.println(name + "baking;");
    }

    public void cut(){
        System.out.println(name + "cutting;");
    }

    public void box(){
        System.out.println(name + "boxing;");
    }
}
