package pattern.builder;

/**
 * Created by david100gom on 2018. 2. 8.
 *
 * Github : https://github.com/david100gom
 */
public class HawaiianPizzaBuilder extends PizzaBuilder {

    public void buildDough() {
        pizza.setDough("cross");
    }

    public void buildSauce() {
        pizza.setSauce("mild");
    }

    public void buildTopping() {
        pizza.setTopping("ham+pineapple");
    }

}