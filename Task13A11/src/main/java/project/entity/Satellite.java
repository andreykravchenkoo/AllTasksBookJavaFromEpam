package project.entity;

import java.util.Objects;

public class Satellite {
    private int id;
    private String name;
    private double radius;
    private double distanceToPlanet;
    private int planetId;

    public Satellite(int id, String name, double radius, double distanceToPlanet, int planetId) {
        this.id = id;
        this.name = name;
        this.radius = radius;
        this.distanceToPlanet = distanceToPlanet;
        this.planetId = planetId;
    }

    public Satellite() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getDistanceToPlanet() {
        return distanceToPlanet;
    }

    public void setDistanceToPlanet(double distanceToPlanet) {
        this.distanceToPlanet = distanceToPlanet;
    }

    public int getPlanetId() {
        return planetId;
    }

    public void setPlanetId(int planetId) {
        this.planetId = planetId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Satellite satellite = (Satellite) o;
        return id == satellite.id && Double.compare(satellite.radius, radius) == 0 && Double.compare(satellite.distanceToPlanet, distanceToPlanet) == 0 && planetId == satellite.planetId && Objects.equals(name, satellite.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, radius, distanceToPlanet, planetId);
    }

    @Override
    public String toString() {
        return "Satellite{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", radius=" + radius +
                ", distanceToPlanet=" + distanceToPlanet +
                ", planetId=" + planetId +
                '}';
    }
}
