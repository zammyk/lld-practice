package parking_lot.assignment_strategy;

import parking_lot.parkingspots.ParkingSpotType;

public class RandomStrategy implements ParkingSpotAssignmentStrategy {
    @Override
    public int getParkingSpot(ParkingSpotType parkingSpotType, int terminalId) {
        return 0;
    }
}
