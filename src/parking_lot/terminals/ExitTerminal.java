package parking_lot.terminals;

import parking_lot.Ticket;
import parking_lot.parkingspots.ParkingRepository;
import parking_lot.parkingspots.ParkingSpot;

import java.time.Instant;
import java.time.temporal.TemporalField;

public class ExitTerminal extends Terminal {
    ParkingRepository parkingRepository;
    public double getTicketFees(Ticket ticket) {
        ParkingSpot parkingSpot = parkingRepository.getParkingSpotFromId(ticket.getParkingSpotId());
        parkingSpot.free();
        return (Instant.now().getNano() - ticket.getEntranceTime().getNano()) * ticket.getParkingSpotType().cost;
    }
}
