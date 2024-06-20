package parking_lot.assignment_strategy;

import parking_lot.parkingspots.ParkingSpot;
import parking_lot.parkingspots.ParkingSpotType;

public interface ParkingSpotAssignmentStrategy {
    ParkingSpot getParkingSpot(ParkingSpotType parkingSpotType, int terminalId);
}
