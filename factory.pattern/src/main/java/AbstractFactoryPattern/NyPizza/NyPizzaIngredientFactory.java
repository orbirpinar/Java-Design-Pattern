package AbstractFactoryPattern.NyPizza;

import AbstractFactoryPattern.Ingredients.Cheese.Cheese;
import AbstractFactoryPattern.Ingredients.Cheese.ReggianoCheese;
import AbstractFactoryPattern.Ingredients.Clams.Clam;
import AbstractFactoryPattern.Ingredients.Clams.FreshClams;
import AbstractFactoryPattern.Ingredients.Dough.Dough;
import AbstractFactoryPattern.Ingredients.Dough.ThinCrustDough;
import AbstractFactoryPattern.Ingredients.Pepperoni.Pepperoni;
import AbstractFactoryPattern.Ingredients.Pepperoni.SlicePepperoni;
import AbstractFactoryPattern.Ingredients.PizzaIngredientFactory;
import AbstractFactoryPattern.Ingredients.Sauce.MarinaraSauce;
import AbstractFactoryPattern.Ingredients.Sauce.Sauce;

public class NyPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicePepperoni();
    }

    @Override
    public Clam createClam() {
        return new FreshClams();
    }
}
