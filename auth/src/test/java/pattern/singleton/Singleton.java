package pattern.singleton;

/**
 * Created by david100gom on 2018. 1. 12.
 *
 * Github : https://github.com/david100gom
 *
 * 고전적인 싱글톤패턴 구현법
 *
 */
public class Singleton {
    // 인스턴스를 저장하기 위한 변수
    // 외부에서 직접 호출할 수 없도록 private으로 선언
    private static Singleton uniqueInstance;

    //생성자도 private으로 선언하여 외부에서 호출할 수 없도록 함
    private Singleton(){}

    //클래스의 유일한 인스턴스를 반환하는 메서드
    public static Singleton getInstance(){
        //인스턴스가 존재하지 않는다면 생성
        if(uniqueInstance == null){
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
