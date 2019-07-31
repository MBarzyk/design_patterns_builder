package design_pattern_builder.zad3;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Client {
    private String name;
    private List<Mail> mailBox;

    public Client(String name, List<Mail> mailBox) {
        this.name = name;
        this.mailBox = mailBox ;
    }

    private void readMail (Mail m) {
        mailBox.add(m);
        System.out.println("Klient " + this.getName() + " received a mail.");
    }
}
