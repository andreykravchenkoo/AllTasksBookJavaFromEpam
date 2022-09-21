package project;

public class Ship implements Runnable {
    private int id;
    private Port port;
    private int currentCapacity;
    private static int generator = 1;
    private static final int MAX_CAPACITY = 10;

    public Ship(Port port) {
        this.id = generator++;
        this.port = port;
        this.currentCapacity = RandomUtil.getRandom();
    }

    public int getId() {
        return id;
    }

    public Port getPort() {
        return port;
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

    public void setPort(Port port) {
        this.port = port;
    }

    public void setCurrentCapacity(int currentCapacity) {
        this.currentCapacity = currentCapacity;
    }

    public static void setGenerator(int generator) {
        Ship.generator = generator;
    }

    @Override
    public void run() {
        try {
            synchronized (port) {
                while (true) {
                    if (!port.getDocks().isEmpty()) {
                        Dock dock = port.getDocks().remove(0);

                        System.out.println(this + " прибыл в " + dock + ". На корабле " + currentCapacity + " контейнеров");

                        port.wait(1000L);

                        if (currentCapacity == 0) {
                            int count = dock.load(this);
                            System.out.println(this + " загрузил на борт " + count + " контейнеров");
                        } else {
                            int count = dock.unload(this);
                            System.out.println(this + " загрузил в порт " + count + " контейнеровю. На корабле осталось " + currentCapacity + " контейнеров");
                        }

                        port.getDocks().add(dock);
                        port.notify();
                        break;
                    } else {
                        System.out.println(this + " ожидает свободный причал");
                        port.wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Ship [id=" + id + "]";
    }
}
