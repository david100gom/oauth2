package pattern.strategy;

/**
 * Created by david100gom on 2018. 1. 2.
 *
 * Github : https://github.com/david100gom
 */
public class Quack implements IQuackBehavior{

    @Override
    public void quack() {
        System.out.println("꽥꽥꽥꽥");
    }

}