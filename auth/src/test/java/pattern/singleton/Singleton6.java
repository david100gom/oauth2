package pattern.singleton;

/**
 * Created by david100gom on 2018. 1. 12.
 *
 * Github : https://github.com/david100gom
 *
 *  INSTANCE가 생성될 때 멀티 스레드로 부터 안전하다는 점, 단 한번 인스턴스 생성을 보장한다는 점, enum value는 자바 전역에서 접근이 가능하다는 점에 있습니다. 또 한 구현이 간편하다는 것도 장점이 될 수 있습니다.
 *
 *
 */
public enum Singleton6 {
    INSTANCE;
    public static Singleton6 getInstance() {
        return INSTANCE;
    }
}