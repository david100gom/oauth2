package pattern.facade;

/**
 * Created by david100gom on 2018. 1. 9.
 *
 * Github : https://github.com/david100gom
 */
class Facade{
    private SubSystem1 subSystem1;
    private SubSystem2 subSystem2;

    public Facade(){
        subSystem1 = new SubSystem1();
        subSystem2 = new SubSystem2();
    }

    public void process(){
        subSystem1.process();
        subSystem2.process();
    }
}
