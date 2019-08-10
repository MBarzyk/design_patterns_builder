package design_pattern_singleton.zad1;

public class PostOffice {
    private Registry registry = new Registry();
    private Machine machine = new Machine();
    private Internet internet = new Internet();

    public Ticket generateTicketRegistry() {
        return registry.generateTicket();
    }
    public Ticket generateTicketMachine() {
        return machine.generateTicket();
    }
    public Ticket generateTicketInternet() {
        return internet.generateTicket();
    }
}
