package project.utils;

import project.builders.CarBuilder;
import project.builders.CarBuilderPool;
import project.builders.Director;
import project.etity.Car;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;

public class FileUtils {
    private static final Logger log = Logger.getLogger("FileUtils.class");
    private static final String FILE_FULL_PATH = "./res/Car.txt";

    public List<Car> getCarListFromFile() {
        List<Car> carList = new ArrayList<>();
        File file = new File(FILE_FULL_PATH);

        try {
            List<String> fileRows = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
            Map<String, Integer> carSet = parseFileRows(fileRows);
            carList = createCertainObject(carSet);
        } catch (IOException e) {
            log.error(e);
        }
        return carList;
    }

    private Map<String, Integer> parseFileRows(List<String> fileRows) {
        Map<String, Integer> map = new HashMap<>();
        String[] splitRow;

        for (int i = 0; i < fileRows.size(); i++) {
            splitRow = fileRows.get(i).trim().split(",");

            if (splitRow.length == 2) {

                try {
                    int count = Integer.parseInt(splitRow[1]);
                    map.put(splitRow[0], count);
                } catch (NumberFormatException e) {
                    log.error(e);
                }
            } else {
                if (!("".equals(splitRow[0]))) {
                    log.warn("Invalid rows format: " + fileRows.get(i));
                }
            }
        }
        return map;
    }

    private List<Car> createCertainObject(Map<String, Integer> carSet) {
        List<Car> carList = new ArrayList<>();
        CarBuilderPool cbp = new CarBuilderPool();
        Director director = new Director();

        for (Map.Entry<String, Integer> element : carSet.entrySet()) {
            int count = 0;

            for (Class<? extends CarBuilder> clazz : cbp) {
                count++;

                if (clazz.getSimpleName().equals(element.getKey())) {

                    try {
                        director.setBuilder(clazz.newInstance());

                        for (int i = 0; i < element.getValue(); i++) {
                            carList.add(director.createCar());
                        }
                    } catch (InstantiationException | IllegalAccessException e) {
                        log.error(e);
                    }
                    count--;
                }
            }

            if (count == cbp.getPoolSize()) {
                log.warn("Such builder doesent exist: " + element.getKey());
            }
        }
        return carList;
    }
}
