package FactoryPattern;

import FactoryPattern.PizzaStore.CaliforniaPizzaStore;
import FactoryPattern.PizzaStore.ChicagoPizzaStore;
import FactoryPattern.PizzaStore.NYPizzaStore;
import FactoryPattern.PizzaStore.PizzaStore;

public class PizzaTestDrive {

    public static void main(String[] args) {

        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        PizzaStore califarnioStore = new CaliforniaPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joe ordered a " + pizza.getName() + "\n");

        pizza = califarnioStore.orderPizza("cheese");
        System.out.println("Orhan ordered a " + pizza.getName() + "\n");
    }
}
