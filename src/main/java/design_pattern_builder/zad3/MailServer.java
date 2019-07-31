package design_pattern_builder.zad3;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class MailServer {
    private List<Client> clientList = new ArrayList<>();

    public void connect(Client... c) {
        for (Client client : c) {
            if (clientList.add(client)) ;
            {
                System.out.println("Client successfully connected.");
            }
        }
    }

    public void disconnect(Client c) {
        if (clientList.remove(c)) {
            System.out.println("Client successfully disconnected");
        }
    }

    public void sendMessage(Mail m, Client sender) {
        clientList
                .stream()
                .filter(c -> !c.getName().equalsIgnoreCase(sender.getName()))
                .map(Client::getMailBox).forEach(mailbox -> mailbox.add(m));
    }
}
