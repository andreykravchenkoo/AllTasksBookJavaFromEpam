package project.entity;

import java.util.Objects;

public class Engine {
    private String model;
    private double volume;
    private int power;

    public Engine(String model, double volume, int power) {
        this.model = model;
        this.volume = volume;
        this.power = power;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return Double.compare(engine.volume, volume) == 0 && power == engine.power && Objects.equals(model, engine.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, volume, power);
    }

    @Override
    public String toString() {
        return "Engine( " + "model= " + model + ", volume= " + volume + ", power= " + power + " )";
    }
}
