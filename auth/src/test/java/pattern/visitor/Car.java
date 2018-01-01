package pattern.visitor;

/**
 * Created by david100gom on 2018. 1. 1.
 *
 * Github : https://github.com/david100gom
 */
public class Car implements CarElement{
    CarElement[] elements;

    public CarElement[] getElements() {
        return elements.clone(); // Return a copy of the array of references.
    }

    public Car() {
        this.elements = new CarElement[]
                { new Wheel("front left"), new Wheel("front right"),
                        new Wheel("back left") , new Wheel("back right"),
                        new Body(), new Engine() };
    }

    public void accept(CarElementVisitor visitor) {
        for(CarElement element : this.getElements()) {
            element.accept(visitor);
        }
        visitor.visit(this);
    }
}