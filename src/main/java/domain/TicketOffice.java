package domain;

import java.util.ArrayList;
import java.util.List;

public class TicketOffice {

    private Money amount;
    private List<Ticket> tickets = new ArrayList<>();

    public TicketOffice(Money amount, List<Ticket> tickets) {
        this.amount = amount;
        this.tickets.addAll(tickets);
    }

    public Money sellTicketTo(Audience audience) {
        return amount.plus(audience.buy(getTicket()));
    }

    private Ticket getTicket() {
        return tickets.remove(0);
    }
}
