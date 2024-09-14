package parking_lot_2;

public class ParkingLotSystem {
    public static void main(String[] args) throws InterruptedException {
        ParkingLot parkingLot = ParkingLot.getParkingLot();
        Ticket ticket = parkingLot.getParkingTicket(ParkingSpotType.MOTORCYCLE);
        Thread.sleep(3000);
        System.out.println(parkingLot.checkoutTicket(ticket));
    }
}
