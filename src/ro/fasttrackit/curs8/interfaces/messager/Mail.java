package ro.fasttrackit.curs8.interfaces.messager;

public class Mail implements MessagingPlatform {
    private String address;

    public Mail(String address) {
        this.address = address;
    }

    @Override
    public void send(String message) {
        System.out.println("Sending mail " + message + " to address " + address);
    }
}
