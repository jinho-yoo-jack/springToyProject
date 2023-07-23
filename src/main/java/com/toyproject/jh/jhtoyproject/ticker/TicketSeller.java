package com.toyproject.jh.jhtoyproject.ticker;

public class TicketSeller {
    private final TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public void sellTo(Audience audience) {
        Ticket ticket = ticketOffice.getTicket();
        // 내 소스에서는 가방을 확인해보는 액션을 TicketSeller가 수행함.
        // 하지만, 내 가방은 나만 볼 수 있어야 함. 남이 맘대로 볼 수 없음.
        Long price = audience.buy(ticket);
        ticketOffice.plusAmount(price);
    }
}
