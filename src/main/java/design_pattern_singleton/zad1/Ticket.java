package design_pattern_singleton.zad1;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Ticket {
    private String origin;
    private int number;

    public Ticket(String origin, int number) {
        this.origin = origin;
        this.number = number;
    }
}
