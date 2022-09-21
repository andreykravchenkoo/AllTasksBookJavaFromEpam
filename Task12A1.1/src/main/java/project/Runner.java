package project;

import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        ArrayList<Dock> docks = new ArrayList<>();
        docks.add(new Dock(10));
        docks.add(new Dock(3));

        Port port = new Port(docks);

        Thread ship1 = new Thread(new Ship(port));
        Thread ship2 = new Thread(new Ship(port));
        Thread ship3 = new Thread(new Ship(port));
        Thread ship4 = new Thread(new Ship(port));
        Thread ship5 = new Thread(new Ship(port));
        Thread ship6 = new Thread(new Ship(port));

        ship1.start();
        ship2.start();
        ship3.start();
        ship4.start();
        ship5.start();
        ship6.start();

        try {
            ship1.join();
            ship2.join();
            ship3.join();
            ship4.join();
            ship5.join();
            ship6.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
