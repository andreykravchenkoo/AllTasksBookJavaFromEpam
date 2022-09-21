package project.utils;

import project.entity.Region;
import project.entity.StateObject;

import java.util.ArrayList;

public class StateObjectRepository {
    private ArrayList<StateObject> stateObjects;

    public StateObjectRepository(ArrayList<StateObject> stateObjects) {
        this.stateObjects = stateObjects;
    }

    public ArrayList<Region> getAllRegions() {
        ArrayList<Region> regions = new ArrayList<>();
        for (int i = 0; i < stateObjects.size(); i++) {
            if (stateObjects.get(i).getClass().equals(Region.class)) {
                regions.add((Region) stateObjects.get(i));
            }
        }
        return regions;
    }

    public Region getRegion() {
        for (int i = 0; i < stateObjects.size(); i++) {
            if (stateObjects.get(i).getClass().equals(Region.class)) {
                return (Region) stateObjects.get(i);
            }
        }
        return null;
    }
}
