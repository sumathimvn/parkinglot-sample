public class ParkingLot {

    public int capacity;


    public ParkingLot(int capacity)
    {
        this.capacity = capacity;
        System.out.println("Total number of parkingslots:" +capacity);

    }


    public Boolean isfull() {

        if (capacity == 0) {
            System.out.println("Parkinglot is full");

            return true;

        } else {
            return false;

        }
    }

    public int addCar()
    {

        capacity = capacity-1;
        System.out.println("Available parkinglots: "+capacity);
        return capacity;

    }

   public int unpark()
   {

       capacity =capacity+1;
       System.out.println("Available parkinglots after unparking:"+capacity);
       return capacity;
   }


  public  int addjeep()
  {

      capacity--;
      return capacity;
  }
  }