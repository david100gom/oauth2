package pattern.strategy;

/**
 * Created by david100gom on 2018. 1. 2.
 *
 * Github : https://github.com/david100gom
 */
public abstract class Duck {

    IFlyBehavior iFlyBehavior;
    IQuackBehavior iQuackBehavior;

    public Duck(){
    }

    public abstract void display();

    public void performFly(){
        iFlyBehavior.fly();
    }

    public void performQuack(){
        iQuackBehavior.quack();
    }

    // 나는 행동 변화
    public void setFlyBehavior(IFlyBehavior fb){
        iFlyBehavior = fb;
    }

    // 소리 변화
    public void setQuackBehavior(IQuackBehavior fb){
        iQuackBehavior = fb;
    }

}