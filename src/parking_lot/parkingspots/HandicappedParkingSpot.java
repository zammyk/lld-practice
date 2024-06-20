package parking_lot.parkingspots;

public class HandicappedParkingSpot extends ParkingSpot {
    HandicappedParkingSpot () {
        super(ParkingSpotType.HANDICAPPED.cost, ParkingSpotType.HANDICAPPED);
    }
}
