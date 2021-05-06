package DecoratorPattern.Condiments;

import DecoratorPattern.Beverage;
import DecoratorPattern.CondimentDecorator;
import DecoratorPattern.Size;

public class Whip extends CondimentDecorator {

    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public Enum<Size> getSize() {
        return beverage.getSize();
    }



    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }


      @Override
    public double cost() {
        double cost = beverage.cost();
        if (getSize() == Size.TALL) {
            cost += .15;
        } else if (getSize() == Size.GRANDE) {
            cost += .25;
        } else if (getSize() == Size.VENTI) {
            cost += .30;
        }
        return cost;
    }
}
