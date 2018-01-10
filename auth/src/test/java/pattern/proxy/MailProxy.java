package pattern.proxy;

/**
 * Created by david100gom on 2018. 1. 10.
 *
 * Github : https://github.com/david100gom
 */
public class MailProxy implements Senderble {

    private Mail mail;
    private String toName;
    private String fromName;

    @Override
    public void setFromName( String name) {

        if( mail != null){
            mail.setFromName( name );
        }

        this.fromName = name;

    }

    @Override
    public void setToName( String name) {
        if( mail != null){
            mail.setToName( name );
        }
        this.toName = name;
    }

    // 실제 Mail의 객체를 거치지 않고도 대리인 만으로 사용가능
    public String getToName() {
        return toName;
    }


    // 실제 Mail의 객체를 거치지 않고도 대리인 만으로 사용가능
    public String getFromName() {
        return fromName;
    }

    // 여러 사용자가 사용하기 때문에 객체가 여러번 생성이 될 수 있습니다.
    // 따라서 동기화 synchronized를 사용 했습니다.
    @Override
    public synchronized  void send() throws InterruptedException {
        if( mail == null){
            mail = new Mail();
        }
        mail.send();
    }

}