package pattern.visitor;

/**
 * Created by david100gom on 2018. 1. 1.
 *
 * Github : https://github.com/david100gom
 */
public interface CarElementVisitor {

    void visit(Wheel wheel);
    void visit(Engine engine);
    void visit(Body body);
    void visit(Car car);

}
