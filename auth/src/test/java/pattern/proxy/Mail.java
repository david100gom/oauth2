package pattern.proxy;

/**
 * Created by david100gom on 2018. 1. 10.
 *
 * Github : https://github.com/david100gom
 */
public class Mail implements Senderble {

    private String toName;
    private String fromName;

    public Mail() throws InterruptedException {

        System.out.println("Mail 객체 생성 시작.....");
        Thread.sleep(5000);
        System.out.println("Mail 객체 생성 끝.....");

    }

    @Override
    public void setFromName(String name) {
        this.fromName = name;
    }

    @Override
    public void setToName(String name) {
        this.toName = name;
    }

    @Override
    public void send() {
        //..... do somthing
    }

    @Override
    public String getFromName() {
        return this.fromName;
    }

    @Override
    public String getToName() {
        return this.toName;
    }

}