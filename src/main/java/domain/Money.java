package domain;

public class Money {

    private Long amount;

    public Money(Long amount) {
        this.amount = amount;
    }

    public Money plus(Money amount) {
        this.amount += amount.amount;
        return amount;
    }
}
