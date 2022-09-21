package project2;

public class Ship implements Runnable {

	private int id;
	private Port port;
	private int currentCapacity;
	private static int generator = 1;
	private static final int MAX_CAPACITY = 10;

	public Ship(Port port) {
		this.port = port;
		this.id = generator++;
		this.currentCapacity = RandomUtil.getRandom();
	}

	@Override
	public void run() {

		try {
			synchronized (port) {
				while (true) {
					if (!port.getDock().isEmpty()) {

						Dock dock = port.getDock().remove(0);

						System.out.println(this + " прибыл в " + dock
								+ ". На корабле " + currentCapacity
								+ " контейнеров.");

						port.wait(1000L);

						if (currentCapacity == 0) {

							int count = dock.load(this);
							System.out.println(this + " загрузил на борт  "
									+ count + " контейнеров.");

						} else {

							int count = dock.unload(this);
							System.out.println(this + " загрузил в порт "
									+ count
									+ " контейнеров. На корабле осталось  "
									+ currentCapacity + " контейнеров.");
						}

						port.getDock().add(dock);
						port.notify();
						break;
					} else {
						System.out.println(this + " ожидает свободный причал.");
						port.wait();
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static int getMaxCapacity() {
		return MAX_CAPACITY;
	}

	public int getCurrentCapacity() {
		return currentCapacity;
	}

	public void setCurrentCapacity(int currentCapacity)	 {
		this.currentCapacity = currentCapacity;
	}

	@Override
	public String toString() {
		return "Ship [id=" + id + "]";
	}

}
