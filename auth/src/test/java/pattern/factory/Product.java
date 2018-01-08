package pattern.factory;

/**
 * Created by david100gom on 2018. 1. 9.
 *
 * Github : https://github.com/david100gom
 */
public abstract class Product {

    public abstract String getName();
    public abstract int getPrice();

    @Override
    public String toString() {
        return "product name : " + getName() + ", price :" + getPrice();
    }
}
