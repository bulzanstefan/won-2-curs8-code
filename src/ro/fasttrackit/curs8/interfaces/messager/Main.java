package ro.fasttrackit.curs8.interfaces.messager;

public class Main {
    public static void main(String[] args) {
        String[] messages = {
                "Salutare tuturor",
                "Lunea viitoare este curs",
                "Sa va terminati assignmenturile"
        };

        ContactPage contactPage = new ContactPage(messages);

        contactPage.sendMessages(new Sms("0755-555555"));
        contactPage.sendMessages(new Email("student@fasttrackit.ro"));
        contactPage.sendMessages(new Mail("Piata Unirii nr.1"));
    }
}
