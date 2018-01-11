package pattern.singleton;

/**
 * Created by david100gom on 2018. 1. 12.
 *
 * Github : https://github.com/david100gom
 *
 * Initialization on demand holder idiom
 *
 * Initialization on demand holder idiom은 lazy-loaded Singleton 으로 모든 Java 버전에서 the idiom은 좋은 성능으로 안전하고 동시 적이며 지연이 적은 초기화를 가능하게 한다.
 * 이것은 JVM의 class loader의 매커니즘과 class의 load 시점을 이용하여 내부 class를 생성시킴으로 thread 간의 동기화 문제를 해결한다.
 *
 */
public class Singleton5 {
    private Singleton5() {}

    private static class LazyHolder {
        static final Singleton5 INSTANCE = new Singleton5();
    }

    public static Singleton5 getInstance() {
        return LazyHolder.INSTANCE;
    }
}
