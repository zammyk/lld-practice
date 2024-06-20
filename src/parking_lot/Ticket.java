package parking_lot;

import parking_lot.parkingspots.ParkingSpotType;

import java.time.Instant;

public class Ticket {
    int id;
    int parkingSpotId;
    Instant entranceTime;
    ParkingSpotType parkingSpotType;
    public Ticket(int parkingSpotId, ParkingSpotType parkingSpotType) {
        this.parkingSpotId = parkingSpotId;
        this.entranceTime = Instant.now();
        this.parkingSpotType = parkingSpotType;
    }
    public Instant getEntranceTime() {
        return entranceTime;
    }
    public ParkingSpotType getParkingSpotType() {
        return parkingSpotType;
    }
}
