package pattern.singleton;

/**
 * Created by david100gom on 2018. 1. 12.
 *
 * Github : https://github.com/david100gom
 *
 * 정적 초기화 시 생성
 *
 * 클래스가 로딩될 때 JVM에서 유일한 인스턴스를 생성해줍니다. 로딩 시 외에는 인스턴스를 생성할 수 없기 때문에 다수의 인스턴스가 생성 될지도 모른다는 문제는 해결했습니다.
 * 하지만 getInstance가 많은 자원을 필요로 한다면 로딩 시 속도 저하의 문제가 발생할 수 있습니다.
 *
 *
 */
public class Singleton3 {
    // 정적 초기화 시 인스턴스 생성
    private static Singleton3 uniqueInstance = new Singleton3();

    private Singleton3(){}

    public static synchronized Singleton3 getInstance(){
        return uniqueInstance;
    }
}