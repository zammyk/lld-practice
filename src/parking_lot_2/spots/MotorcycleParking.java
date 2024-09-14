package parking_lot_2.spots;

import parking_lot_2.ParkingSpot;
import parking_lot_2.ParkingSpotType;

public class MotorcycleParking extends ParkingSpot {
    @Override
    public ParkingSpotType getType() {
        return ParkingSpotType.MOTORCYCLE;
    }

    @Override
    public double getHourlyRate() {
        return 20;
    }
}
