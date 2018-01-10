package pattern.proxy;

/**
 * Created by david100gom on 2018. 1. 10.
 *
 * Github : https://github.com/david100gom
 */
public interface Senderble {

    void setFromName( String nam);

    void setToName( String nam);

    String getFromName();

    String getToName();

    void send() throws InterruptedException;

}
