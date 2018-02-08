package pattern.builder;

/**
 * Created by david100gom on 2018. 2. 8.
 *
 * Github : https://github.com/david100gom
 */
public class BuilderExample {

    public static void main(String[] args) {

        Cook cook = new Cook();
        PizzaBuilder hawaiianPizzaBuilder = new HawaiianPizzaBuilder();
        PizzaBuilder spicyPizzaBuilder = new SpicyPizzaBuilder();

        cook.setPizzaBuilder(hawaiianPizzaBuilder);
        cook.constructPizza();

        Pizza pizza = cook.getPizza();



    }

}