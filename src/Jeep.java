public class Jeep implements Parkable
{

@Override
            public void park (ParkingLot parkinglot)
            {


            if (parkinglot.isfull())
            {
                System.out.println("Parking is full");

            }
            else
                {

                System.out.println("Jeep is parked");
                parkinglot.addjeep();

            }



        }


}