package Controllers;

import DTO.IssueTicketRequest;
import DTO.IssueTicketResponse;
import DTO.ResponseStatus;
import Models.Ticket;
import Services.TicketService;

public class TicketController {
    private TicketService ticketService;
    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }
    public IssueTicketResponse ticketIssue(IssueTicketRequest request){
        IssueTicketResponse response = new IssueTicketResponse();
        try{
            Ticket ticket = ticketService.issueTicket(
                    request.getVehicleNumber(),
                    request.getVehicleOwner(),
                    request.getVehicleType(),
                    request.getGateId()
            );
            response.setTicket(ticket);
            response.setResponseStatus(ResponseStatus.SUCCESS);
        }
        catch (Exception e){
            response.setResponseStatus(ResponseStatus.FAILURE);
        }

        return response;
    }
}
