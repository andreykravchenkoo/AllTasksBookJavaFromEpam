package Task18;

import java.util.Objects;

public class Car {
    private String name;
    private int position;
    private int speed;

    public Car(String name, int position, int speed) {
        this.name = name;
        this.position = position;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return position == car.position && speed == car.speed && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, position, speed);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", position=" + position +
                ", speed=" + speed +
                '}';
    }
}
