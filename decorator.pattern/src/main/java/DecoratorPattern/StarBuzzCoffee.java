package DecoratorPattern;

import DecoratorPattern.Beverages.DarkRoast;
import DecoratorPattern.Beverages.Espresso;
import DecoratorPattern.Beverages.HouseBlend;
import DecoratorPattern.Condiments.Mocha;
import DecoratorPattern.Condiments.Soy;
import DecoratorPattern.Condiments.Whip;

public class StarBuzzCoffee {

    public static void main(String[] args) {

        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $" +  beverage3.cost());

        /*
        We are going to see a much better way of creating decorated objects
        when we cover the Factory Pattern(and the Builder Pattern)
        * */
    }
}
