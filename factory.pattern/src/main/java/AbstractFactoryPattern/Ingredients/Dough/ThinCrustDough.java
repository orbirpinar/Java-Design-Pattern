package AbstractFactoryPattern.Ingredients.Dough;

public class ThinCrustDough implements Dough {
    @Override
    public void sauce() {
        System.out.println("Thin Dough..");
    }
}
