package AbstractFactoryPattern.Ingredients.Dough;

public class ThickCrustDough implements Dough {
    @Override
    public void sauce() {
        System.out.println("Thick dough");
    }
}
