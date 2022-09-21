package Task10;

import java.util.Objects;

public class RoadWay implements Comparable<RoadWay> {
    private String startingCity;
    private String destinationCity;
    private int distance;

    public RoadWay(String startingCity, String destinationCity, int distance) {
        this.startingCity = startingCity;
        this.destinationCity = destinationCity;
        this.distance = distance;
    }

    public String getStartingCity() {
        return startingCity;
    }

    public String getDestinationCity() {
        return destinationCity;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RoadWay roadWay = (RoadWay) o;
        return distance == roadWay.distance && Objects.equals(startingCity, roadWay.startingCity) && Objects.equals(destinationCity, roadWay.destinationCity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startingCity, destinationCity, distance);
    }

    @Override
    public String toString() {
        return "RoadWay{" +
                "startingCity='" + startingCity + '\'' +
                ", destinationCity='" + destinationCity + '\'' +
                ", distance=" + distance +
                '}';
    }

    @Override
    public int compareTo(RoadWay o) {
        return this.distance - o.distance;
    }
}
