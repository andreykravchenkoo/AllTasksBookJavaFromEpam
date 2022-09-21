package project;

import java.util.concurrent.Semaphore;

public class Parking {
    private String name;
    private int places;
    private static int countPlaces;
    private final boolean[] PARKING_PLACES;
    private final Semaphore semaphore;

    public Parking(String name, int places) {
        this.name = name;
        this.places = places;
        PARKING_PLACES = new boolean[places];
        semaphore = new Semaphore(places, true);
        countPlaces = places;
    }

    public synchronized int parking(int governmentNumber) {
        int parkingNumber = 0;

        if (countPlaces < 1) {
            System.out.println("Car " + governmentNumber + " waiting for a parking place");
            try {
                wait(5450);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < places; i++) {

            if (!PARKING_PLACES[i]) {
                PARKING_PLACES[i] = true;
                parkingNumber = i;
                countPlaces--;
                System.out.printf("Car №%d has parked in place %d.\n", governmentNumber, i);
                System.out.println("left parking places " + countPlaces);
                return parkingNumber;
            }
        }

        return -1;
    }

    public synchronized void unParking(int parkingNumber) {
        PARKING_PLACES[parkingNumber] = false;

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        countPlaces++;
        System.out.println("Parking place #: " + parkingNumber + " free");
        notify();
    }
}
