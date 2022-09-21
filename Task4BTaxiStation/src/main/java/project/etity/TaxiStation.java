package project.etity;

import java.util.*;

public class TaxiStation implements Iterable<Car> {
    private List<Car> list;

    public TaxiStation(List<Car> list) {
        this.list = list;
    }

    public List<Car> getCarWithSpeedAmountRange(int from, int to) {
        System.out.println("");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("");
        System.out.println("Vehicles that match the given range of speed parameters: " + from + " - " + to);

        List<Car> speedList = new ArrayList<>();

        for (Car car : list) {
            if (car.getSpeed() >= from && car.getSpeed() <= to) {
                speedList.add(car);
            }
        }
        return speedList;
    }

    public void sortByFuelConsumption() {
        System.out.println("");
        System.out.println("Sort by fuel consumption: ");

        Collections.sort(list, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getFuelСonsumption()  - o2.getFuelСonsumption();
            }
        });
    }

    public void getTaxiStationPrice() {

        int price = 0;

        for (Car car : list) {
            price += car.getPrice();
        }

        System.out.println("");
        System.out.println("Taxi station price: " + price);
        System.out.println("");
    }

    @Override
    public Iterator<Car> iterator() {
        return list.iterator();
    }
}
