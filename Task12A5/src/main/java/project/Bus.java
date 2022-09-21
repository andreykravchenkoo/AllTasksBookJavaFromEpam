package project;

import java.util.Objects;

public class Bus {
    private int busNumber;

    public Bus(int busNumber) {
        this.busNumber = busNumber;
    }

    public int getBusNumber() {
        return busNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bus bus = (Bus) o;
        return busNumber == bus.busNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(busNumber);
    }

    @Override
    public String toString() {
        return "Bus{" +
                "busNumber=" + busNumber +
                '}';
    }
}
