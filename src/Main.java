
public class Main {


 public static void main(String[] args){


     Parkable car1 = new Car();
     ParkingLot parkinglot = new ParkingLot(4);
     car1.park(parkinglot);

     Car car2 = new Car();
     car2.park(parkinglot);

     Car car3 = new Car();
     car3.park(parkinglot);


     Jeep jeep = new Jeep();
     jeep.park(parkinglot);


     System.out.println("Parking status:"+parkinglot.isfull());



 }
}
