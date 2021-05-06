package FactoryPattern;

import java.util.ArrayList;

public abstract class Pizza {

    protected String name;
    protected String dough;
    protected String sauce;
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

/*
1--) First, Joel and Ethan need an instance of  a PizzaStore.  Joel needs to instantiate a
ChicagoPizzaStore and Ethan needs a NYPizzaStore.
2--) With a PizzaStore in hand, both Ethan and Joel call the orderPizza() method and pass
in the type of  pizza they want (cheese, veggie, and so on).
3--) To create the pizzas, the createPizza() method is called, which is deﬁned in the
two subclasses NYPizzaStore and ChicagoPizzaStore.  As we deﬁned them, the
NYPizzaStore instantiates a NY style pizza, and the ChicagoPizzaStore instantiates
Chicago style pizza.  In either case, the Pizza is returned to the orderPizza() method.
4--) The orderPizza() method has no idea what kind of  pizza was created, but it knows it is
a pizza and it prepares, bakes, cuts, and boxes it for Ethan and Joel.

*/
