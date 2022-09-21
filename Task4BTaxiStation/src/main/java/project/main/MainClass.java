package project.main;

import org.apache.log4j.BasicConfigurator;
import project.builders.TaxiStationBuilder;
import project.etity.Car;
import project.etity.TaxiStation;

public class MainClass {
    public static void main(String[] args) {
        BasicConfigurator.configure();
        TaxiStation taxiStation = TaxiStationBuilder.createTaxiStation();

        taxiStation.sortByFuelConsumption();

        for (Car car: taxiStation) {
            System.out.println(car);
        }

        for (Car car: taxiStation.getCarWithSpeedAmountRange(200, 240)) {
            System.out.println(car);
        }

        taxiStation.getTaxiStationPrice();
    }
}
