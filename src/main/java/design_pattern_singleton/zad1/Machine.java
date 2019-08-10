package design_pattern_singleton.zad1;

public class Machine {
    public Ticket generateTicket () {
        return new Ticket("Machine", TicketGenerator.GENERATOR.getCounter());
    }
}
