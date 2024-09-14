package parking_lot_2;

import parking_lot_2.spots.MotorcycleParking;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private static ParkingLot parkingLot = null;
    private final List<Level> levels;
    private ParkingLot() {
        levels = new ArrayList<>();
        for(int lev = 0; lev < Constants.LEVEL_COUNT; lev++) {
            Level level = new Level();
            level.setParkingSpots(new ArrayList<>());
            for(int ps = 0; ps < Constants.PARKING_SPOT_COUNT; ps++) {
                // Just has motorcycles for now hehe
                ParkingSpot parkingSpot = new MotorcycleParking();
                parkingSpot.setLevelId(level.getId());
                level.getParkingSpots().add(parkingSpot);
            }
            levels.add(level);
        }
    }
    public static synchronized ParkingLot getParkingLot() {
        if (parkingLot == null) {
            parkingLot = new ParkingLot();
        }
        return parkingLot;
    }
    public synchronized Ticket getParkingTicket(ParkingSpotType parkingSpotType) {
        for(Level level: levels) {
            for(ParkingSpot parkingSpot: level.getParkingSpots()) {
                if(parkingSpot.getType() == parkingSpotType) {
                    parkingSpot.setAvailable(false);
                    Ticket ticket = new Ticket();
                    ticket.setEntryTime(LocalDateTime.now());
                    ticket.setParkingSpot(parkingSpot);
                    return ticket;
                }
            }
        }
        return null;
    }
    public synchronized double checkoutTicket(Ticket ticket) {
        ticket.getParkingSpot().setAvailable(true);
        LocalDateTime now = LocalDateTime.now();
        long hours = ChronoUnit.SECONDS.between(ticket.getEntryTime(), now);
        return hours * ticket.getParkingSpot().getHourlyRate();
    }
}
