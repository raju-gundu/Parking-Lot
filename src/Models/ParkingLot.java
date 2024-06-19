package Models;

import java.util.List;

public class ParkingLot {
    private List<ParkingFloor> floors;
    private List<Gate> gates;
    private List<VehicleType> vehicleTypes;
    private ParkingLotStatus parkingLotStatus;
    private SpotAssignmentStratergyType spotAssignmentStratergyType;
    private FeesCalculatorStratergyType feesCalculatorStratergyType;

    public List<ParkingFloor> getFloors() {
        return floors;
    }

    public void setFloors(List<ParkingFloor> floors) {
        this.floors = floors;
    }

    public List<Gate> getGates() {
        return gates;
    }

    public void setGates(List<Gate> gates) {
        this.gates = gates;
    }

    public List<VehicleType> getVehicleTypes() {
        return vehicleTypes;
    }

    public void setVehicleTypes(List<VehicleType> vehicleTypes) {
        this.vehicleTypes = vehicleTypes;
    }

    public ParkingLotStatus getParkingLotStatus() {
        return parkingLotStatus;
    }

    public void setParkingLotStatus(ParkingLotStatus parkingLotStatus) {
        this.parkingLotStatus = parkingLotStatus;
    }

    public SpotAssignmentStratergyType getSpotAssignmentStratergyType() {
        return spotAssignmentStratergyType;
    }

    public void setSpotAssignmentStratergyType(SpotAssignmentStratergyType spotAssignmentStratergyType) {
        this.spotAssignmentStratergyType = spotAssignmentStratergyType;
    }

    public FeesCalculatorStratergyType getFeesCalculatorStratergyType() {
        return feesCalculatorStratergyType;
    }

    public void setFeesCalculatorStratergyType(FeesCalculatorStratergyType feesCalculatorStratergyType) {
        this.feesCalculatorStratergyType = feesCalculatorStratergyType;
    }
}
