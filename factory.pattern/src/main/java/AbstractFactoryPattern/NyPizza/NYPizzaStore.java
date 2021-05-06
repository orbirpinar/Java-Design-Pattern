package AbstractFactoryPattern.NyPizza;

import AbstractFactoryPattern.*;
import AbstractFactoryPattern.Ingredients.PizzaIngredientFactory;

public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new NyPizzaIngredientFactory();
        switch (item) {
            case "cheese":
                pizza = new CheesePizza(pizzaIngredientFactory);
            case "clam":
                pizza = new ClamPizza(pizzaIngredientFactory);
            case "pepperoni":
                pizza = new PepperoniPizza(pizzaIngredientFactory);
        }

        return pizza;
    }
}
