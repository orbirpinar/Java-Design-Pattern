package DecoratorPattern.Condiments;

import DecoratorPattern.Beverage;
import DecoratorPattern.CondimentDecorator;
import DecoratorPattern.Size;

public class Mocha extends CondimentDecorator {


    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public Enum<Size> getSize() {
        return beverage.getSize();
    }


    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        double cost = beverage.cost();
        if (getSize() == Size.TALL) {
            cost += .20;
        } else if (getSize() == Size.GRANDE) {
            cost += .30;
        } else if (getSize() == Size.VENTI) {
            cost += .40;
        }
        return cost;
    }
}
