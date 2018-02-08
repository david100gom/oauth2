package pattern.builder;

/**
 * Created by david100gom on 2018. 2. 8.
 *
 * Github : https://github.com/david100gom
 */
abstract class PizzaBuilder {

    protected Pizza pizza;

    public Pizza getPizza() {
        return pizza;
    }

    public void createNewPizzaProduct() {
        pizza = new Pizza();
    }

    public abstract void buildDough();

    public abstract void buildSauce();

    public abstract void buildTopping();

}