package pattern.singleton;

/**
 * Created by david100gom on 2018. 1. 12.
 *
 * Github : https://github.com/david100gom
 *
 * 멀티스레드 프로그램에서 싱글톤패턴 - synchronized - 애플리케이션의 속도가 급격하게 저하
 *
 */
public class Singleton2 {

    private static Singleton2 uniqueInstance;

    private Singleton2(){}

    //synchronized 추가
    public static synchronized Singleton2 getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new Singleton2();
        }
        return uniqueInstance;
    }
}
