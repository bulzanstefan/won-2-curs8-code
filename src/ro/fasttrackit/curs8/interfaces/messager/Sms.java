package ro.fasttrackit.curs8.interfaces.messager;

public class Sms implements MessagingPlatform {
    private String telephone;

    public Sms(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public void send(String message) {
        System.out.println("Sending sms " + message + " to " + telephone);
    }
}
