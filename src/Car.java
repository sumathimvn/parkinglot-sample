public class Car extends Vehicle {


    public boolean park(ParkingLot parkinglot) {

        if (parkinglot.isfull()) {
            System.out.println("Parking is full");
            return true;
        } else {

            parkinglot.addCar();
        }


        return false;
    }


    public boolean  unpark(ParkingLot parkinglot)
{

       parkinglot.unpark();
       System.out.println("Parking is available");

       return true;
}

    }