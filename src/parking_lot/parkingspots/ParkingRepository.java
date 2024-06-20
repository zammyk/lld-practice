package parking_lot.parkingspots;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ParkingRepository {
    Map<ParkingSpotType, List<ParkingSpot>> parkingSpots;
    public List<ParkingSpot> getAvailableParkingSpots(ParkingSpotType parkingSpotType) {
        return parkingSpots.get(parkingSpotType)
                .stream()
                .filter(parkingSpot -> !parkingSpot.isTaken)
                .collect(Collectors.toList());
    }
    public ParkingSpot getParkingSpotFromId(int id) {
        return null;
    }
}
