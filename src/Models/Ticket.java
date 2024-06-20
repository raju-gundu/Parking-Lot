package Models;

import java.util.Date;

public class Ticket extends BaseModel {
    private String ticketNumber;
    private Date entryTime;
    private Vehicle vehicle;
    private ParkingSpot ParkingSpot;
    private Operator generatedBy;
    private Gate gate;

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Models.ParkingSpot getParkingSpot() {
        return ParkingSpot;
    }

    public void setParkingSpot(Models.ParkingSpot parkingSpot) {
        ParkingSpot = parkingSpot;
    }

    public Operator getGeneratedBy() {
        return generatedBy;
    }

    public void setGeneratedBy(Operator generatedBy) {
        this.generatedBy = generatedBy;
    }

    public Gate getGate() {
        return gate;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }
}
