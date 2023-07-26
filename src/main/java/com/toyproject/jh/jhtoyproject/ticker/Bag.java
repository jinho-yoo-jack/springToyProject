package com.toyproject.jh.jhtoyproject.ticker;

public class Bag {
    private Long amount;
    private final Invitation invitation;
    private Ticket ticket;

    public Bag(long amount){
        this(null, amount);
    }
    public Bag(Invitation invitation, long amount){
        this.invitation = invitation;
        this.amount = amount;
    }

    public boolean hasInvitation() {
        return invitation != null;
    }

    private void setTicket(Ticket ticket){
        this.ticket = ticket;
    }

    public boolean hasTicket() {
        return ticket != null;
    }

    private void minusAmount(long amount) {
        this.amount -= amount;
    }

    private void plusAmount(long amount) {
        this.amount += amount;
    }

    public Long hold(Ticket ticket){
        setTicket(ticket);
        if(hasInvitation()){
            return 0L;
        }else {
            minusAmount(ticket.getFee());
            return ticket.getFee();
        }
    }
}
