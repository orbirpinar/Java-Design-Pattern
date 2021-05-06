package FactoryPattern.PizzaStore;

import FactoryPattern.NYStylePizza.NYStyleCheesePizza;
import FactoryPattern.NYStylePizza.NYStylePepperoniPizza;
import FactoryPattern.NYStylePizza.NYStyleVeggiePizza;
import FactoryPattern.Pizza;

public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String item) {
        switch (item) {
            case "cheese":
                return new NYStyleCheesePizza();
            case "veggie":
                return new NYStyleVeggiePizza();
            case "pepperoni":
                return new NYStylePepperoniPizza();
            default:
                return null;
        }
    }
}
