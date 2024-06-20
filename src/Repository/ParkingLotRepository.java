package Repository;

import Models.Gate;
import Models.ParkingLot;

import java.util.HashMap;
import java.util.Map;

public class ParkingLotRepository {
    Map<Long, ParkingLot> parkingLots = new HashMap<Long, ParkingLot>();
    public ParkingLot findByGate(Gate gate) {
        for (ParkingLot parkingLot : parkingLots.values()) {
            if (parkingLot.getGates().contains(gate)) {
                return parkingLot;
            }
        }
        return null;
    }
}
