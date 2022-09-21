package Task18;

public class MainClass {
    public static void main(String[] args) {
        RaceService raceService = new RaceService();
        RaceRepository raceRepository = new RaceRepository();
        raceRepository.raceOvertaking.put(new Car("BMW", 5, 260), 0);
        raceRepository.raceOvertaking.put(new Car("MERCEDES", 2, 140), 0);
        raceRepository.raceOvertaking.put(new Car("VOLKSWAGEN", 3, 150), 0);
        raceRepository.raceOvertaking.put(new Car("DODGE", 4, 240), 0);
        raceRepository.raceOvertaking.put(new Car("FORD", 1, 130), 0);

        raceService.getCountOvertaking(raceRepository.raceOvertaking);
        raceService.getTotalOvertaking(raceRepository.raceOvertaking);
    }
}
