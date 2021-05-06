package AbstractFactoryPattern.ChiacagoPizza;

import AbstractFactoryPattern.*;
import AbstractFactoryPattern.Ingredients.PizzaIngredientFactory;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new ChicagoPizzaIngredientFactory();
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
