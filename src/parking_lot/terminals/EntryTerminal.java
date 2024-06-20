package parking_lot.terminals;

import parking_lot.Ticket;
import parking_lot.assignment_strategy.ParkingSpotAssignmentStrategy;
import parking_lot.parkingspots.ParkingSpotType;

public class EntryTerminal extends Terminal {
    ParkingSpotAssignmentStrategy parkingSpotAssignmentStrategy;
    EntryTerminal (ParkingSpotAssignmentStrategy parkingSpotAssignmentStrategy) {
        this.parkingSpotAssignmentStrategy = parkingSpotAssignmentStrategy;
    }
    Ticket generateTicket(ParkingSpotType parkingSpotType) {
        int parkingSpotId = parkingSpotAssignmentStrategy.getParkingSpot(parkingSpotType, this.id);
        return new Ticket(parkingSpotId, parkingSpotType);
    }
}
