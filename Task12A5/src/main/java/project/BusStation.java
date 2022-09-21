package project;

import java.util.LinkedList;
import java.util.List;

public class BusStation extends Thread {
    public List<Bus> busListOnStation = new LinkedList<>();
    private static final int BUS_AMOUNT = 2;

    @Override
    public void run() {
    }
}
