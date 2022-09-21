package project2;

public class Dock {

	private int id;
	private int currentCapacity;
	private static int generator = 1;
	private static final int MAX_CAPACITY = 50;

	public Dock() {
		this.id = generator++;
	}

	public Dock(int currentCapacity) {
		this.id = generator++;
		this.currentCapacity = currentCapacity;
	}

	public int load(Ship ship) {
		int temp = currentCapacity;

		if (currentCapacity == 0) {

			System.out.println("В " + this + " нет контейнеров.");
		} else if (ship.getCurrentCapacity() == 0) {

			ship.setCurrentCapacity(currentCapacity > Ship.getMaxCapacity() ? Ship
					.getMaxCapacity() : currentCapacity);
			currentCapacity = temp - ship.getCurrentCapacity();
		}

		return ship.getCurrentCapacity();
	}

	public int unload(Ship ship) {
		int tempDock = currentCapacity;
		int tempShip = ship.getCurrentCapacity();

		if (currentCapacity == MAX_CAPACITY) {
			System.out.println("В " + this + " нет места.");

		} else if ((currentCapacity + ship.getCurrentCapacity()) <= MAX_CAPACITY) {

			currentCapacity += ship.getCurrentCapacity();
			ship.setCurrentCapacity(0);
		} else {

			currentCapacity = MAX_CAPACITY;
			ship.setCurrentCapacity(tempShip - (currentCapacity - tempDock));

		}
		return (tempShip - ship.getCurrentCapacity());
	}

	public int getCurrentCapacity() {
		return currentCapacity;
	}

	public void setCurrentCapacity(int currentCapacity) {
		this.currentCapacity = currentCapacity;
	}

	public static int getMaxCapacity() {
		return MAX_CAPACITY;
	}

	@Override
	public String toString() {
		return "Dock [id=" + id + "]";
	}

}
