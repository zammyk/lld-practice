package parking_lot.assignment_strategy;

import parking_lot.parkingspots.ParkingRepository;
import parking_lot.parkingspots.ParkingSpot;
import parking_lot.parkingspots.ParkingSpotType;

public class RandomStrategy implements ParkingSpotAssignmentStrategy {
    ParkingRepository parkingRepository;
    @Override
    public ParkingSpot getParkingSpot(ParkingSpotType parkingSpotType, int terminalId) {
//        return parkingRepository.getAvailableParkingSpots(parkingSpotType);
        return null;
    }
}
