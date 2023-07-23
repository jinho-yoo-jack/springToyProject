package com.toyproject.jh.jhtoyproject.ticker;

public class Theater {
    private TicketSeller ticketSeller;

    public void enter(Audience audience){
        ticketSeller.sellTo(audience);
    }


}
