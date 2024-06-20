package parking_lot;

import parking_lot.parkingspots.ParkingSpotType;
import parking_lot.terminals.EntryTerminal;
import parking_lot.terminals.ExitTerminal;

public class ParkingLotSystem {
    Ticket getParkingTicket(EntryTerminal entryTerminal, ParkingSpotType parkingSpotType) {
        return entryTerminal.generateTicket(parkingSpotType);
    }
    double getParkingFees(ExitTerminal exitTerminal, Ticket ticket) {
        return  exitTerminal.getTicketFees(ticket);
    }
}
