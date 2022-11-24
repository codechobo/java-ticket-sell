import domain.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Ticket> tickets = new ArrayList<>();
        for (int count = 1; count <= 10; count++) {
            Ticket ticket = new Ticket(new Money(2000L));
            tickets.add(ticket);
        }

        Invitation invitation = Invitation.of("나에게"
                , LocalDateTime.of(2022, 12, 28, 15, 0)
                , "우아한 테크 코스 합격 축하드립니다,"
                , "포비가");

        Audience audience = new Audience(new Bag(new Money(50000L), invitation));
        Theater theater = new Theater(new TicketSeller(new TicketOffice(new Money(100000L), tickets)));

        theater.enter(audience);
    }
}
