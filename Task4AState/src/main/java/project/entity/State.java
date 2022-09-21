package project.entity;

import java.util.ArrayList;
import java.util.Objects;

public class State {
    private String name;
    private String capital;
    private int area;
    private ArrayList<StateObject> stateObjects;

    public State(String name, String capital, int area) {
        this.name = name;
        this.capital = capital;
        this.area = area;
    }

    public State(String name, String capital, int area, ArrayList<StateObject> stateObjects) {
        this.name = name;
        this.capital = capital;
        this.area = area;
        this.stateObjects = stateObjects;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public ArrayList<StateObject> getStateObjects() {
        return stateObjects;
    }

    public void setStateObjects(ArrayList<StateObject> stateObjects) {
        this.stateObjects = stateObjects;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        State state = (State) o;
        return area == state.area && Objects.equals(name, state.name) && Objects.equals(capital, state.capital) && Objects.equals(stateObjects, state.stateObjects);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, capital, area, stateObjects);
    }

    @Override
    public String toString() {
        return "State{ " + "name= " + name + ", capital= " + capital + ", area= " + area + ", stateObjects= " + stateObjects + " }";
    }
}
