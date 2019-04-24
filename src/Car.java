public class Car {

    private String Regno;

    public void park(ParkingLot parkingLot){

        if (parkingLot.isfull())
        {
            System.out.println("Parking is full");

            parkingLot.addCar();
        }


    }
}
