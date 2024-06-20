package parking_lot.assignment_strategy;

import parking_lot.parkingspots.ParkingSpotType;

public interface ParkingSpotAssignmentStrategy {
    int getParkingSpot(ParkingSpotType parkingSpotType, int terminalId);
}
