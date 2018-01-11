package pattern.singleton;

/**
 * Created by david100gom on 2018. 1. 12.
 *
 * Github : https://github.com/david100gom
 *
 * DCL(Double-checking Locking)
 *
 * Multi-processor 가 shared-memory 를 사용하면서 문제가 발생하기 쉽다고 합니다. 따라서 안정성이 불안하다면 이 방법은 사용하지 않는 것이 좋습니다.
 *
 */
public class Singleton4 {
    // volatile 추가
    private volatile static Singleton4 uniqueInstance;

    private Singleton4(){}

    public static Singleton4 getInstance(){
        if(uniqueInstance == null){ // 인스턴스가 있는지 확인
            synchronized (Singleton.class){ // 최초에만 동기화
                if(uniqueInstance == null){ //다시 한번 확인
                    uniqueInstance = new Singleton4();
                }
            }
        }
        return uniqueInstance;
    }
}
