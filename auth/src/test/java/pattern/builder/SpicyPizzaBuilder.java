package pattern.builder;

/**
 * Created by david100gom on 2018. 2. 8.
 *
 * Github : https://github.com/david100gom
 */
public class SpicyPizzaBuilder extends PizzaBuilder {

    public void buildDough() {
        pizza.setDough("pan baked");
    }

    public void buildSauce() {
        pizza.setSauce("hot");
    }

    public void buildTopping() {
        pizza.setTopping("pepperoni+salami");
    }

}