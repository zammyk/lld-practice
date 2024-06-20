package parking_lot.terminals;

import parking_lot.Ticket;
import parking_lot.assignment_strategy.ParkingSpotAssignmentStrategy;
import parking_lot.parkingspots.ParkingSpot;
import parking_lot.parkingspots.ParkingSpotType;

public class EntryTerminal extends Terminal {
    ParkingSpotAssignmentStrategy parkingSpotAssignmentStrategy;
    EntryTerminal (ParkingSpotAssignmentStrategy parkingSpotAssignmentStrategy) {
        this.parkingSpotAssignmentStrategy = parkingSpotAssignmentStrategy;
    }
    public Ticket generateTicket (ParkingSpotType parkingSpotType) {
        ParkingSpot parkingSpot = parkingSpotAssignmentStrategy.getParkingSpot(parkingSpotType, this.id);
        return new Ticket(parkingSpot.getId(), parkingSpotType);
    }
}
