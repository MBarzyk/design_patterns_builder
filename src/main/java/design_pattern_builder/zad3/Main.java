package design_pattern_builder.zad3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Mail> mailbox1 = new ArrayList<>();
        List<Mail> mailbox2 = new ArrayList<>();
        List<Mail> mailbox3 = new ArrayList<>();
        List<Mail> mailbox4 = new ArrayList<>();

        MailServer server = new MailServer();

        Client client1 = new Client("Krzysiek", mailbox1);
        Client client2 = new Client("Adam", mailbox2);
        Client client3 = new Client("Wiktor", mailbox3);
        Client client4 = new Client("Piotr", mailbox4);

        List<Client> clientlist = new ArrayList<>(Arrays.asList(client1, client2, client3, client4));


        server.connect(client1, client2, client3, client4);

        Mail mail = new Mail.Builder().setContent("Kup pan Viagre za 5 zloty").setIsSpam(true).setMessageType(MessageType.OFFER).setSender(client1.getName()).createMail();

        server.sendMessage(mail, client1);

        clientlist.stream().collect(Collectors.toMap(
                c -> c.getName(),
                c -> c.getMailBox())).forEach((key, value) -> System.out.println("User: " + key + ", mailbox: " + value));
    }
}
