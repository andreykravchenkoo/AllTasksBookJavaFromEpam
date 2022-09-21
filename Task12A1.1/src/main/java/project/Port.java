package project;

import java.util.ArrayList;

public class Port {
    private ArrayList<Dock> docks;

    public Port(ArrayList<Dock> docks) {
        this.docks = docks;
    }

    public ArrayList<Dock> getDocks() {
        return docks;
    }
}
