package project2;

import java.util.ArrayList;

/*
 * Задание 4. Многопоточность. Порт . Корабли заходят в порт для
 * разгрузки/загрузки контейнеров. Число контейнеров, находящихся в текущий
 * момент в порту и на корабле, должно быть неотрицательным и превышающим
 * заданную грузоподъемность судна и вместимость порта. В порту работает
 * несколько причалов. У одного причала может стоять один корабль. Корабль может
 * загружаться у причала или разгружаться
 */

public class Runner {

	public static void main(String[] args) {

		ArrayList<Dock> docks = new ArrayList<Dock>();
		docks.add(new Dock(10));
		docks.add(new Dock(3));

		Port port = new Port(docks);

		Thread ship1 = new Thread(new Ship(port));
		Thread ship2 = new Thread(new Ship(port));
		Thread ship3 = new Thread(new Ship(port));
		Thread ship4 = new Thread(new Ship(port));
		Thread ship5 = new Thread(new Ship(port));
		Thread ship6 = new Thread(new Ship(port));

		ship1.start();
		ship2.start();
		ship3.start();
		ship4.start();
		ship5.start();
		ship6.start();

		try {
			ship1.join();
			ship2.join();
			ship3.join();
			ship4.join();
			ship5.join();
			ship6.join();
		} catch (Exception e) {
			e.printStackTrace();
		}

		/*
		 * 
		 * List<Thread> ships = Stream.of(new Ship(port), new Ship(port), new
		 * Ship(port), new Ship(port)) .map(Thread::new).peek(s -> s.start())
		 * .collect(Collectors.toList());
		 * 
		 * for (Thread ship : ships) { try { ship.join(); } catch (Exception e)
		 * { e.printStackTrace(); } }
		 */
		for (Dock d : port.getDock()) {
			System.out.println("\n" + d + " находится "
					+ d.getCurrentCapacity() + " контейнеров.");
		}
	}

}
