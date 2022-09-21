package project.utils;

import project.entity.State;
import project.entity.StateObject;

import java.util.ArrayList;

public class Utils {
    public static void stateToString(State state) {
        System.out.println(state.toString());
        System.out.println("[ StateObject: ");
        listStateObjectToString(state.getStateObjects());
        System.out.println("]");
    }

    private static void listStateObjectToString(ArrayList<StateObject> list) {
        String result = "";

        for (int i = 0; i < list.size(); i++) {
            result += "" + list.get(i) + "\n";
        }

        System.out.println(result);
    }
}
