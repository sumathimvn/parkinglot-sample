
public class Main {


 public static void main(String[] args){



     Car car1 = new Car();
     ParkingLot parkinglot = new ParkingLot(2);
     car1.park(parkinglot);

     Car car2 = new Car();
     car2.park(parkinglot);

     System.out.println("Parking status:"+parkinglot.isfull());



 }
}
