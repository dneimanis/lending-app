package io.codelex.lendingapp;

import java.time.LocalDate;

public class Loans {
    
    private final long id;
    private final String status;
    private final LocalDate created;
    private final LocalDate dueDate;
    private final int principal;
    private final double interest;
    private final double total;

    public Loans(long id, String status, LocalDate created, LocalDate dueDate, int principal, double interest, double total) {
        this.id = id;
        this.status = status;
        this.created = created;
        this.dueDate = dueDate;
        this.principal = principal;
        this.interest = interest;
        this.total = total;
    }

    public long getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public LocalDate getCreated() {
        return created;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public int getPrincipal() {
        return principal;
    }

    public double getInterest() {
        return interest;
    }

    public double getTotal() {
        return total;
    }
}
