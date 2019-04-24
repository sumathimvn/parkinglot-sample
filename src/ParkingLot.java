public class ParkingLot {

    private int capacity;
    private int carsparked;

    public ParkingLot(int capacity) {
        this.capacity = capacity;

    }

    public Boolean isfull() {

        if (capacity == 0) {
            System.out.println("Parkinglot is full");

            return true;

        } else
            return false;

    }

    public void addCar() {
        capacity--;
    }
   public void unpark() {

       capacity++;
   }

   }


