package kirill.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Main.class, args);

        TicketNumberGenerator ticketGenerator = context.getBean(TicketNumberGenerator.class);

        System.out.println(ticketGenerator.createNewNumber());
        System.out.println(ticketGenerator.createNewNumber());
        System.out.println(ticketGenerator.createNewNumber());
        System.out.println(ticketGenerator.createNewNumber());
        System.out.println();

        System.out.println("1 -> " + context.getBean(QueuePresenter.class).newTicket());
        System.out.println("2 -> " + context.getBean(QueuePresenter.class).newTicket());
        System.out.println("3 -> " + context.getBean(QueuePresenter.class).newTicket());
    }
}
