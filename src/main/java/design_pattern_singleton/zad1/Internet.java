package design_pattern_singleton.zad1;

public class Internet {
    public Ticket generateTicket () {
        return new Ticket("Internet", TicketGenerator.GENERATOR.getCounter());
    }
}
