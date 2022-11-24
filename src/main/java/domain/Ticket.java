package domain;

public class Ticket {

    private Money fee;

    public Ticket(Money fee) {
        this.fee = fee;
    }

    public Money getFee() {
        return fee;
    }
}
