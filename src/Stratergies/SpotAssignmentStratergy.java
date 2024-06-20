package Stratergies;

import Models.Gate;
import Models.ParkingSpot;
import Models.VehicleType;

public interface SpotAssignmentStratergy {
    ParkingSpot getParkingSpot(Gate gate, VehicleType vehicleType);
}
