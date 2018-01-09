package pattern.facade;

/**
 * Created by david100gom on 2018. 1. 9.
 *
 * Github : https://github.com/david100gom
 *
 *
 * facade pattern
 *  어떤 서브시스템 일련의 인터페이스에 대한 통합된 인터페이스를 제공하는 패턴이다 즉 서버시스템의 기능을 사용할수 있는 간단한 인터페이스를 제공한다
 *
 */
public class Main {
    public static void main(String[] args){
        Facade facade = new Facade();
        facade.process();
    }
}
