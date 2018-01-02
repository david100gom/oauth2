package pattern.strategy;

/**
 * Created by david100gom on 2018. 1. 2.
 *
 * Github : https://github.com/david100gom
 */
public class NoFly implements IFlyBehavior{

    @Override
    public void fly() {
        System.out.println("날지못해요");
    }

}