
public class Main {


 public static void main(String[] args){



     ParkingLot parkinglot = new ParkingLot(3);
     Vehicle car1 = new Car();
     car1.park(parkinglot);
     Vehicle car2 = new Car();
     car2.park(parkinglot);

     Vehicle car3 = new Car();
     car3.park(parkinglot);

     Vehicle jeep1 = new Jeep();
     jeep1.park(parkinglot);
     System.out.println("Unparking car1");
     car1.unpark(parkinglot);

     Vehicle jeep2 = new Jeep();
     jeep2.park(parkinglot);

     //jeep1.unpark(parkinglot);


     System.out.println("Parking status is full:"+parkinglot.isfull());



 }
}
