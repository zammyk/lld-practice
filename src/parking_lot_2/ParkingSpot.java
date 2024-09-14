package parking_lot_2;

import java.util.UUID;

public abstract class ParkingSpot {
    private UUID id;
    private UUID levelId;
    private boolean isAvailable = true;

    public abstract ParkingSpotType getType();
    public abstract double getHourlyRate();

    public UUID getLevelId() {
        return levelId;
    }

    public void setLevelId(UUID levelId) {
        this.levelId = levelId;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
