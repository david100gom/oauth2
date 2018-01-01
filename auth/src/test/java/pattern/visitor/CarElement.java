package pattern.visitor;

/**
 * Created by david100gom on 2018. 1. 1.
 *
 * Github : https://github.com/david100gom
 */
public interface CarElement {
    void accept(CarElementVisitor visitor); // CarElements have to provide accept().
}
