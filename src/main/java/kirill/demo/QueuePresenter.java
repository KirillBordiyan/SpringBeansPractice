package kirill.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class QueuePresenter {
    @Autowired
    private TicketNumberGenerator generator;

    public Ticket newTicket() {
        return new Ticket(generator.createNewNumber(), LocalDate.now());
    }
}
