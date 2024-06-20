package parking_lot.parkingspots;

public enum ParkingSpotType {
    HANDICAPPED(10),
    COMPACT(20),
    LARGE(30),
    MOTORCYCLE(10);
    public final int cost;
    private ParkingSpotType(int cost) {
        this.cost = cost;
    }
}
