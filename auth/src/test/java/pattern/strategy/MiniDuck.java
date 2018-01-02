package pattern.strategy;

/**
 * Created by david100gom on 2018. 1. 2.
 *
 * Github : https://github.com/david100gom
 */
public class MiniDuck extends Duck {

    public MiniDuck(){
        iFlyBehavior = new FlyWithWings();
        iQuackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("작은오리");
    }

}