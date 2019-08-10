package design_pattern_singleton.zad1;

public class TicketGenerator {
    public static final TicketGenerator GENERATOR = new TicketGenerator();
    private int counter = 0;

    private TicketGenerator() {
    }

    public int getCounter() {
        return counter++;
    }
}
