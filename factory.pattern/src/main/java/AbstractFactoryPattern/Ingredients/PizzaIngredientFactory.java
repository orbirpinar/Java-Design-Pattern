package AbstractFactoryPattern.Ingredients;

import AbstractFactoryPattern.Ingredients.Cheese.Cheese;
import AbstractFactoryPattern.Ingredients.Clams.Clam;
import AbstractFactoryPattern.Ingredients.Dough.Dough;
import AbstractFactoryPattern.Ingredients.Pepperoni.Pepperoni;
import AbstractFactoryPattern.Ingredients.Sauce.Sauce;

public interface PizzaIngredientFactory {

    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Pepperoni createPepperoni();
    public Clam createClam();
}
