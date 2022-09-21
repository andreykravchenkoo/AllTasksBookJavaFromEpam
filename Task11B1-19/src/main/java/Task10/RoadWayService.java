package Task10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class RoadWayService {
    RoadWayRepository roadWayRepository = new RoadWayRepository();

    public void findMinDistance() {
        addingToRepository(roadWayRepository);
        System.out.println("All list: " + roadWayRepository.getRoadWayTreeSet().toString());

        System.out.println("Minimum distance from Dnipro to another city: " + roadWayRepository.getRoadWayTreeSet().first());
    }

    private void addingToRepository(RoadWayRepository roadWayRepository) {
        try {
            Scanner scanner = new Scanner(new File("Map.txt"));

            do {

                String line = scanner.nextLine();
                String[] arrayWord = getArrayWord(line);
                int[] arrayNumbers = getArrayNumbers(line);

                roadWayRepository.getRoadWayTreeSet().add(new RoadWay(arrayWord[0], arrayWord[1], arrayNumbers[0]));

            } while (scanner.hasNext());
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public int[] getArrayNumbers(String line) {
        line = line.replaceAll("\\D+", " ").trim();
        String[] arrayWord = line.split("\\s+");
        int[] arrayNumbers = Arrays.stream(arrayWord).mapToInt(Integer::parseInt).toArray();
        return arrayNumbers;
    }

    public String[] getArrayWord(String line) {
        String[] array = line.split("\\s+");
        return array;
    }
}
