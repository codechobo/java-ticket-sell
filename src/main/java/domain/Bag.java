package domain;

public class Bag {

    private Money money;
    private Ticket ticket;
    private Invitation invitation;

    public Bag(Money money) {
        this(money, null);
    }

    public Bag(Money money, Invitation invitation) {
        this.money = money;
        this.invitation = invitation;
    }

    public Money hold(Ticket ticket) {
        // 초대장이 있으면 무료
        if (hasInvitation()) {
            receiveTicket(ticket);
            return ticket.getFee();
        }
        // 초대장이 없으면 유료
        else {
            Money resultMoney = money.minus(ticket.getFee());
            receiveTicket(ticket);
            return resultMoney;
        }
    }

    private boolean hasInvitation() {
        return this.invitation != null;
    }

    private void receiveTicket(Ticket ticket) {
        this.ticket = ticket;
    }
}
