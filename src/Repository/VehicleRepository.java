package Repository;

import Models.Vehicle;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class VehicleRepository {
    Map<Long, Vehicle> vehicles = new HashMap<Long, Vehicle>();
    Long id = 0L;
    public Optional<Vehicle> findByVehicleNumber(String vehicleNumber) {
        if (vehicles.containsKey(Long.parseLong(vehicleNumber))) {
            return Optional.of(vehicles.get(Long.parseLong(vehicleNumber)));
        }
        return Optional.empty();
    }

    public Vehicle saveVehicle(Vehicle vehicle) {
        id+=1;
        vehicle.setId(id);
        vehicles.put(id, vehicle);
        return vehicle;
    }
}
