package parking_lot.terminals;

import parking_lot.Ticket;

import java.time.Instant;
import java.time.temporal.TemporalField;

public class ExitTerminal extends Terminal {
    public double getTicketFees(Ticket ticket) {
        return (Instant.now().getNano() - ticket.getEntranceTime().getNano()) * ticket.getParkingSpotType().cost;
    }
}
