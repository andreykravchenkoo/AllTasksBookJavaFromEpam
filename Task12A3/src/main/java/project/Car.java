package project;

public class Car implements Runnable {
    private int governmentNumber;
    private int parkingNumber;
    private Parking parking;

    public Car(int governmentNumber, Parking parking) {
        this.governmentNumber = governmentNumber;
        this.parking = parking;
    }

    @Override
    public void run() {

        System.out.printf("Car #%d pulled into the parking lot.\n", governmentNumber);
        try {
            parkingNumber = parking.parking(governmentNumber);

            if (parkingNumber == - 1) {
                System.out.println("Car " + governmentNumber + " did not wait for a free space and is going to another parking lot");
                return;
            }

            Thread.sleep(5000);
            parking.unParking(parkingNumber);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
