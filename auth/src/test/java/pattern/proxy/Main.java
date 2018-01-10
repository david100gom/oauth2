package pattern.proxy;

/**
 * Created by david100gom on 2018. 1. 10.
 *
 * Github : https://github.com/david100gom
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {

        MailProxy mailProxy = new MailProxy();
        mailProxy.setFromName("피터팬");
        mailProxy.setToName("팅커벨");
        mailProxy.send();

    }

}