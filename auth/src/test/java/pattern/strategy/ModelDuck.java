package pattern.strategy;

/**
 * Created by david100gom on 2018. 1. 2.
 *
 * Github : https://github.com/david100gom
 */
public class ModelDuck extends Duck{

    public ModelDuck(){
        iFlyBehavior = new NoFly(); // "날지못해요"
        iQuackBehavior = new QQuack(); // "꾸에에에에에~~엑"
    }

    @Override
    public void display() {
        System.out.println("모형오리");
    }

}