package project.builders;

import project.etity.Car;
import project.etity.TaxiStation;
import project.utils.FileUtils;

import java.util.List;

public class TaxiStationBuilder {
    public static TaxiStation createTaxiStation() {
        FileUtils fileUtils = new FileUtils();
        List<Car> list = fileUtils.getCarListFromFile();
        TaxiStation taxiStation = new TaxiStation(list);
        return taxiStation;
    }
}
