package com.attraction;

public class Attraction {

    private Ticket ticketing;

    public Attraction() {
    }

    public Attraction(Ticket ticketing) {
        this.ticketing = ticketing;
    }

    public Ticket getTicketing() {
        return ticketing;
    }

    public void setTicketing(Ticket ticketing) {
        this.ticketing = ticketing;
    }

    @Override
    public String toString() {
        return "Attraction{" +
                "ticketing=" + ticketing +
                '}';
    }
}
