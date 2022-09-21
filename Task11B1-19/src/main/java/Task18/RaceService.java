package Task18;

import java.util.HashMap;
import java.util.Map;

public class RaceService {

    public void getCountOvertaking(HashMap<Car, Integer> hashMap) {

        for (Map.Entry<Car, Integer> first : hashMap.entrySet()) {
            for (Map.Entry<Car, Integer> second : hashMap.entrySet()) {
                int countOvertaking = 0;
                if (first.getKey().getPosition() > second.getKey().getPosition() && first.getKey().getSpeed() > second.getKey().getSpeed()) {
                    countOvertaking++;
                    hashMap.put(first.getKey(), first.getValue() + countOvertaking);
                }
            }

            System.out.println("Car: " + first.getKey().getName() + " count overtaking: " + first.getValue());
        }
    }

    public void getTotalOvertaking(HashMap<Car, Integer> hashMap) {
        int sum = hashMap.values().stream().mapToInt(Integer::intValue).sum();

        System.out.println("Total count overtaking: " + sum);
    }
}
