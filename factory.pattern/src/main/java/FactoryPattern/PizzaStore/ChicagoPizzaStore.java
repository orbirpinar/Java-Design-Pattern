package FactoryPattern.PizzaStore;

import FactoryPattern.ChicagoStylePizza.ChicagoPepperoniPizza;
import FactoryPattern.ChicagoStylePizza.ChicagoStyleCheesePizza;
import FactoryPattern.ChicagoStylePizza.ChicagoVeggiePizza;
import FactoryPattern.Pizza;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String item) {
        switch (item){
            case "cheese":
                return new ChicagoStyleCheesePizza();
            case "veggie":
                return new ChicagoVeggiePizza();
            case "pepperoni":
                return new ChicagoPepperoniPizza();
            default:
                return null;
        }

    }
}
