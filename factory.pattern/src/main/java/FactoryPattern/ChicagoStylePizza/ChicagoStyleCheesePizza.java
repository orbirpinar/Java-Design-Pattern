package FactoryPattern.ChicagoStylePizza;

import FactoryPattern.Pizza;

public class ChicagoStyleCheesePizza extends Pizza {

    public ChicagoStyleCheesePizza() {
        name = "Chicago Style Deep Fish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum tomato sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }

    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
