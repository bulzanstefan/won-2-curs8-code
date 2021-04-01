package ro.fasttrackit.curs8.interfaces.messager;

public class ContactPage {
    private String[] messages;

    public ContactPage(String[] messages) {
        this.messages = messages;
    }

    public void sendMessages(MessagingPlatform platform) {
        for (String msg : messages) {
            platform.send("FST: " + msg);
        }
    }
}
