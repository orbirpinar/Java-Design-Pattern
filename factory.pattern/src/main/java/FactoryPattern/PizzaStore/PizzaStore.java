package FactoryPattern.PizzaStore;

import FactoryPattern.Pizza;

public abstract class PizzaStore {



    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.box();
        pizza.cut();
        
        return pizza;
    }

    public abstract Pizza createPizza(String type);

}
