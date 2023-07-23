package com.toyproject.jh.jhtoyproject.ticker;

public class Audience {
    private final Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

    public Long buy(Ticket ticket){
        Long amount = 0L;
        if(!bag.hasInvitation()){
            bag.minusAmount(ticket.getFee());
            amount = ticket.getFee();
        }
        bag.setTicket(ticket);
        return amount;
    }

}
