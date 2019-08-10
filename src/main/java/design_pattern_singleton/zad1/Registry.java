package design_pattern_singleton.zad1;

public class Registry {
    public Ticket generateTicket () {
        return new Ticket("Registry", TicketGenerator.GENERATOR.getCounter());
    }
}
