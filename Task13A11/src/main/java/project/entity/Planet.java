package project.entity;

import java.util.Objects;

public class Planet {
    private int id;
    private String name;
    private double radius;
    private double coreTemperature;
    private boolean presenceAtmosphere;
    private boolean presenceLife;
    private int galaxyId;

    public Planet(int id, String name, double radius, double coreTemperature, boolean presenceAtmosphere, boolean presenceLife, int galaxyId) {
        this.id = id;
        this.name = name;
        this.radius = radius;
        this.coreTemperature = coreTemperature;
        this.presenceAtmosphere = presenceAtmosphere;
        this.presenceLife = presenceLife;
        this.galaxyId = galaxyId;
    }

    public Planet() {

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

    public double getCoreTemperature() {
        return coreTemperature;
    }

    public void setCoreTemperature(double coreTemperature) {
        this.coreTemperature = coreTemperature;
    }

    public boolean isPresenceAtmosphere() {
        return presenceAtmosphere;
    }

    public void setPresenceAtmosphere(boolean presenceAtmosphere) {
        this.presenceAtmosphere = presenceAtmosphere;
    }

    public boolean isPresenceLife() {
        return presenceLife;
    }

    public void setPresenceLife(boolean presenceLife) {
        this.presenceLife = presenceLife;
    }

    public int getGalaxyId() {
        return galaxyId;
    }

    public void setGalaxyId(int galaxyId) {
        this.galaxyId = galaxyId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Planet planet = (Planet) o;
        return id == planet.id && Double.compare(planet.radius, radius) == 0 && Double.compare(planet.coreTemperature, coreTemperature) == 0 && presenceAtmosphere == planet.presenceAtmosphere && presenceLife == planet.presenceLife && galaxyId == planet.galaxyId && Objects.equals(name, planet.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, radius, coreTemperature, presenceAtmosphere, presenceLife, galaxyId);
    }

    @Override
    public String toString() {
        return "Planet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", radius=" + radius +
                ", coreTemperature=" + coreTemperature +
                ", presenceAtmosphere=" + presenceAtmosphere +
                ", presenceLife=" + presenceLife +
                ", galaxyId=" + galaxyId +
                '}';
    }
}
