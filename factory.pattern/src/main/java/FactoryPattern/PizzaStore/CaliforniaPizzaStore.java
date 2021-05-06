package FactoryPattern.PizzaStore;


import FactoryPattern.CalifarnioStylePizza.CaliforniaCheesePizza;
import FactoryPattern.CalifarnioStylePizza.CaliforniaVeggiePizza;
import FactoryPattern.Pizza;

public class CaliforniaPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String item) {
        switch (item) {
            case "cheese":
                return new CaliforniaCheesePizza();
            case "veggie":
                return new CaliforniaVeggiePizza();
            default:
                return null;
        }

    }

}
