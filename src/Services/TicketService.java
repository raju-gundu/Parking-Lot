package Services;

import Exceptions.GateNotFoundException;
import Models.*;
import Repository.GateRepository;
import Repository.ParkingLotRepository;
import Repository.TicketRepository;
import Repository.VehicleRepository;
import Stratergies.SpotAssignmentStratergy;
import Stratergies.SpotAssignmentStratergyFactory;

import java.util.Date;
import java.util.Optional;
import java.util.Random;

public class TicketService {
    private GateRepository gateRepository;
    private VehicleRepository vehicleRepository;
    private ParkingLotRepository parkingLotRepository;
    private TicketRepository ticketRepository;

    public TicketService(GateRepository gateRepository, VehicleRepository vehicleRepository, ParkingLotRepository parkingLotRepository,TicketRepository ticketRepository) {
        this.gateRepository = gateRepository;
        this.vehicleRepository = vehicleRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.ticketRepository = ticketRepository;
    }

    public Ticket issueTicket(String vehicleNumber,
                              String vehicleOwnerName,
                              VehicleType vehicleType,
                              Long gateId) throws GateNotFoundException {
        Ticket ticket = new Ticket();
        ticket.setEntryTime(new Date());
        Optional<Gate> optionalGate = gateRepository.findByGateId(gateId);
        if (optionalGate.isEmpty()) {
            throw new GateNotFoundException();
        }
        Gate gate = optionalGate.get();
        ticket.setGate(gate);

        Vehicle savedVehicle;
        Optional<Vehicle> optionalVehicle = vehicleRepository.findByVehicleNumber(vehicleNumber);
        if (!optionalVehicle.isPresent()){
            Vehicle vehicle = new Vehicle();
            vehicle.setVehicleNumber(vehicleNumber);
            vehicle.setVehicleType(vehicleType);
            vehicle.setOwnerName(vehicleOwnerName);
            savedVehicle = vehicleRepository.saveVehicle(vehicle);
        }
        else {
            savedVehicle = optionalVehicle.get();
        }
        ticket.setVehicle(savedVehicle);
        ticket.setGeneratedBy(gate.getOperator());
        ticket.setTicketNumber("Ticket number " + new Random().nextInt());

        SpotAssignmentStratergyType type = parkingLotRepository.findByGate(gate).getSpotAssignmentStratergyType();
        SpotAssignmentStratergy stratergy = SpotAssignmentStratergyFactory.getSpotAssignmentStratergy(type);
        ticket.setParkingSpot(stratergy.getParkingSpot(gate,vehicleType));
        ticketRepository.saveTicket(ticket);
        return ticket;
    }
}
