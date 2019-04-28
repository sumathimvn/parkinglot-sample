public class Jeep extends Vehicle {

    public boolean park(ParkingLot parkinglot) {


        if (parkinglot.isfull()) {
            System.out.println("Parking is full");
            return true;

        } else {

            parkinglot.addjeep();
            System.out.println("Jeep is parked in parking lot");


        }


        return false;
    }

    @java.lang.Override
    public boolean unpark(ParkingLot parkinglot) {


           parkinglot.unpark();
           System.out.println("Parking is available");

           return true;
    }

}



