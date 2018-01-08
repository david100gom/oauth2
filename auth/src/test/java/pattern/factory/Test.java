package pattern.factory;

/**
 * Created by david100gom on 2018. 1. 9.
 *
 * Github : https://github.com/david100gom
 */
public class Test {

    public static void main(String[] args) {

        Product t1 = ProductFactory.getProduct("ticket", "한국여행", 300000);
        Product c1 = ProductFactory.getProduct("computer", "pc", 1500000);

        System.out.println(t1.toString());
        System.out.println(c1.toString());

    }

}
