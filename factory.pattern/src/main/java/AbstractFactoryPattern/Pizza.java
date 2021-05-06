package AbstractFactoryPattern;

import AbstractFactoryPattern.Ingredients.Cheese.Cheese;
import AbstractFactoryPattern.Ingredients.Clams.Clam;
import AbstractFactoryPattern.Ingredients.Dough.Dough;
import AbstractFactoryPattern.Ingredients.Sauce.Sauce;

import java.util.ArrayList;

public abstract class Pizza {

    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Cheese cheese;
    protected Clam clam;
    protected ArrayList<String> toppings = new ArrayList();

    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings:");
        for (String topping : toppings) {
            System.out.println(" " + topping);
        }
    }

    public void bake() {
        System.out.println("Bake for 25 minutes at 250");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }
}
