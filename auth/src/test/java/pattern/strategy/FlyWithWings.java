package pattern.strategy;

/**
 * Created by david100gom on 2018. 1. 2.
 *
 * Github : https://github.com/david100gom
 */
public class FlyWithWings implements IFlyBehavior {
    @Override
    public void fly() {
        System.out.println("날고있어요");
    }
}
