package pattern.visitor;

/**
 * Created by david100gom on 2018. 1. 1.
 *
 * Github : https://github.com/david100gom
 */
public class Wheel implements CarElement {
    private String name;

    public Wheel(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void accept(CarElementVisitor visitor) {
        visitor.visit(this);
    }
}