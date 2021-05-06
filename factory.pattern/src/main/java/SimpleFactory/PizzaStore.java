package SimpleFactory;

public class PizzaStore {

    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
//        Pizza pizza = null;
//        if (type.equals("cheese")) {
//            pizza = new CheesePizza();
//        }else if(type.equals("pepperoni")) {
//            pizza = new PepperoniPizza();
//        }else if(type.equals("clam")) {
//            pizza = new ClamPizza();
//        }else if(type.equals("veggie")) {
//            pizza = new VeggiePizza();
//        }

        Pizza pizza;

        pizza = factory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.box();
        pizza.cut();
        
        return pizza;
    }

}
