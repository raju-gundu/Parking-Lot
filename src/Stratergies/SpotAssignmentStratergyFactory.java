package Stratergies;

import Models.ParkingSpot;
import Models.SpotAssignmentStratergyType;

public class SpotAssignmentStratergyFactory {
    public static SpotAssignmentStratergy getSpotAssignmentStratergy(SpotAssignmentStratergyType spotAssignmentStratergyType) {
        return new NearestSpotAssignmentStratergy();
    }
}
