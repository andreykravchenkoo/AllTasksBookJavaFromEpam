package project;

public class Dock {
    private int id;
    private int currentCapacity;
    private static int generator = 1;
    private final static int MAX_CAPACITY = 50;

    public Dock() {
        this.id = generator++;
    }

    public Dock(int currentCapacity) {
        this.id = generator++;
        this.currentCapacity = currentCapacity;
    }

    public int getId() {
        return id;
    }

    public int getCurrentCapacity() {
        return currentCapacity;
    }

    public static int getGenerator() {
        return generator;
    }

    public static int getMaxCapacity() {
        return MAX_CAPACITY;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCurrentCapacity(int currentCapacity) {
        this.currentCapacity = currentCapacity;
    }

    public static void setGenerator(int generator) {
        Dock.generator = generator;
    }

    public int load(Ship ship) {
        int temp = currentCapacity;

        if (currentCapacity == 0) {
            System.out.println("В " + this + " нет контейнеров");
        } else if (ship.getCurrentCapacity() == 0) {
            ship.setCurrentCapacity(currentCapacity > Ship.getMaxCapacity() ? Ship.getMaxCapacity() : currentCapacity);
            currentCapacity = temp - ship.getCurrentCapacity();
        }

        return ship.getCurrentCapacity();
    }

    public int unload(Ship ship) {
        int tempDock = currentCapacity;
        int tempShip = ship.getCurrentCapacity();

        if (currentCapacity == MAX_CAPACITY) {
            System.out.println("В " + this + " нет места");
        } else if ((currentCapacity + ship.getCurrentCapacity()) <= MAX_CAPACITY) {
            currentCapacity += ship.getCurrentCapacity();
            ship.setCurrentCapacity(0);
        } else {
            currentCapacity = MAX_CAPACITY;
            ship.setCurrentCapacity(tempShip - (currentCapacity - tempDock));
        }

        return (tempShip - ship.getCurrentCapacity());
    }

    @Override
    public String toString() {
        return "Dock [id=" + id + "]";
    }
}
