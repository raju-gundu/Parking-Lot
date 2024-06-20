package Stratergies;

import Models.*;
import Repository.ParkingLotRepository;

public class NearestSpotAssignmentStratergy implements SpotAssignmentStratergy{
    ParkingLotRepository parkingLotRepository;



    @Override
    public ParkingSpot getParkingSpot(Gate gate, VehicleType vehicleType) {
        ParkingLot parkingLot =  parkingLotRepository.findByGate(gate);
        for (ParkingFloor parkingFloor : parkingLot.getFloors()) {
            for (ParkingSpot parkingSpot : parkingFloor.getParkingSpots()) {
                if (parkingSpot.getParkingSpotStatus().equals(ParkingSpotStatus.EMPTY) && parkingSpot.getSupportedVehicleTypes().contains(vehicleType)){
                    return parkingSpot;
                }
            }
        }

        return null;
    }
}
