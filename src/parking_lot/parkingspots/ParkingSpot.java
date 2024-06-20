package parking_lot.parkingspots;

public abstract class ParkingSpot {
    int id;
    double cost;
    boolean isTaken = false;
    ParkingSpotType parkingSpotType;
    ParkingSpot (double cost, ParkingSpotType parkingSpotType) {
        this.cost = cost;
        this.parkingSpotType = parkingSpotType;
    }
    public int getId() {
        return id;
    }
    public void free() {
        this.isTaken = false;
    }
}
