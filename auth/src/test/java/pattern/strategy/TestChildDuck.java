package pattern.strategy;

/**
 * Created by david100gom on 2018. 1. 2.
 *
 * Github : https://github.com/david100gom
 *
 * 스트래티지 패턴 : 알고리즘군을 정의하고 각각을 캡슐화하여 교환해서 사용할 수 있도록 만든다. 스트래티지를 활용하면 알고리즘을 사용하는 클라이언트와는 독립적으로 알고리즘을 변경할 수 있다.
 *
 *
 */
public class TestChildDuck {

    public static void main(String[] args) {
        // 작은오리
        Duck miniDuck = new MiniDuck();
        miniDuck.display();
        miniDuck.performFly();
        miniDuck.performQuack();

        System.out.println();

        // 모형오리
        Duck modelDuck = new ModelDuck();
        modelDuck.display();
        modelDuck.performFly();
        modelDuck.performQuack();
        // 모형오리가 날수 있게 수정 할 수 있다.
        modelDuck.setFlyBehavior(new FlyWithWings());
        modelDuck.performFly();

    }

}