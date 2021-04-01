package ro.fasttrackit.curs8.interfaces.messager;

public class Email implements MessagingPlatform {
    private String email;

    public Email(String email) {
        this.email = email;
    }

    @Override
    public void send(String message) {
        System.out.println("Sending email " + message + "to " + email);
    }
}
