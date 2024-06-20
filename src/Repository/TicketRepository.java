package Repository;

import Models.Ticket;

import java.util.HashMap;
import java.util.Map;

public class TicketRepository {
    Map<Long, Ticket> tickets = new HashMap<Long, Ticket>();
    Long id =0L;
    public Ticket saveTicket(Ticket ticket) {
        id+=1;
        ticket.setId(id);
        tickets.put(id, ticket);
        return ticket;
    }
}
