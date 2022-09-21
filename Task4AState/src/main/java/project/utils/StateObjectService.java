package project.utils;

import project.entity.Region;

import java.util.ArrayList;

public class StateObjectService {
    private StateObjectRepository stateObjectRepository;

    public StateObjectService(StateObjectRepository stateObjectRepository) {
        this.stateObjectRepository = stateObjectRepository;
    }

    public ArrayList<Region> getAllRegion() {
        return stateObjectRepository.getAllRegions();
    }

    public Region getRegion() {
        return stateObjectRepository.getRegion();
    }
}
