package project;

import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainClass {
    public static void main(String[] args) {
        Parking mostCityParking = new Parking("Most City Parking", 5);

        Random random = new Random();

        ExecutorService service = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            service.submit(new Car(random.nextInt(1000), mostCityParking));
        }

        service.shutdown();
    }
}
