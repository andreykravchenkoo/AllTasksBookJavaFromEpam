package project2;

import java.util.ArrayList;

public class Port {
	private ArrayList<Dock> dock;

	public Port(ArrayList<Dock> dock) {
		this.dock = dock;

	}

	public ArrayList<Dock> getDock() {
		return dock;
	}

}
