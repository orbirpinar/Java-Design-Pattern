package FactoryPattern.CalifarnioStylePizza;

import FactoryPattern.Pizza;

public class CaliforniaCheesePizza extends Pizza {

    public CaliforniaCheesePizza() {
        name = "California Style Cheese Pizza";
        dough = "Extra Thin";
        sauce = "garlic tomato sauce";

        toppings.add("Mozzarella Cheese");
    }
}
