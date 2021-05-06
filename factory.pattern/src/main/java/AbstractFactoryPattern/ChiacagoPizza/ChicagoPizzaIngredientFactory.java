package AbstractFactoryPattern.ChiacagoPizza;

import AbstractFactoryPattern.Ingredients.Cheese.Cheese;
import AbstractFactoryPattern.Ingredients.Cheese.MozzarellaCheese;
import AbstractFactoryPattern.Ingredients.Clams.Clam;
import AbstractFactoryPattern.Ingredients.Clams.FrozenClams;
import AbstractFactoryPattern.Ingredients.Dough.Dough;
import AbstractFactoryPattern.Ingredients.Dough.ThickCrustDough;
import AbstractFactoryPattern.Ingredients.Pepperoni.Pepperoni;
import AbstractFactoryPattern.Ingredients.Pepperoni.SlicePepperoni;
import AbstractFactoryPattern.Ingredients.PizzaIngredientFactory;
import AbstractFactoryPattern.Ingredients.Sauce.PlumTomatoSauce;
import AbstractFactoryPattern.Ingredients.Sauce.Sauce;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicePepperoni();
    }

    @Override
    public Clam createClam() {
        return new FrozenClams();
    }
}
