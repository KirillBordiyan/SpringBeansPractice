package kirill.demo;

import java.time.LocalDate;

public class Ticket {
    private String number;
    private LocalDate createdAt;

    public Ticket(String number, LocalDate createdAt) {
        this.number = number;
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "Ticket(" +
                "number='" + number + '\'' +
                ", createdAt=" + createdAt +
                ')';
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }
}
