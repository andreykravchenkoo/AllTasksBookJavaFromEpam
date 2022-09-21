package project.entity;

import java.util.Objects;

public class StateObject {
    private String name;
    private int population;
    private int are;

    public StateObject(String name, int population, int are) {
        this.name = name;
        this.population = population;
        this.are = are;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getAre() {
        return are;
    }

    public void setAre(int are) {
        this.are = are;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StateObject that = (StateObject) o;
        return population == that.population && are == that.are && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, population, are);
    }

    @Override
    public String toString() {
        return "StateObject{ " + "name= " + name + ", population= " + population + ", are= " + are + " }";
    }
}
