package pattern.visitor;

/**
 * Created by david100gom on 2018. 1. 1.
 *
 * Github : https://github.com/david100gom
 */
public class Engine implements CarElement {
    public void accept(CarElementVisitor visitor) {
        visitor.visit(this);
    }
}
