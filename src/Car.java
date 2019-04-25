public class Car implements Parkable{

    private String Regno;

    @Override
    public void park(ParkingLot parkinglot) {


        if (parkinglot.isfull())
        {
            System.out.println("Parking is full");

        }
        else
            {


            parkinglot.addCar();

            System.out.println("Car is parked");
        }


}


//*   public void unpark(ParkingLot parkinglot)
//{

   //       parkinglot.unpark();
    //      System.out.println("Parking is available");

   // }


}
