package project;

import java.util.Queue;

public class Cashier extends Thread {
    volatile private Queue<Customer> customerQueue;

    public Cashier(String name, Queue<Customer> customerQueue) {
        super(name);
        this.customerQueue = customerQueue;
        this.setDaemon(true);
        start();
    }

    @Override
    public void run() {
        while (true) {
            try {
                Customer currentCustomer = null;
                synchronized (customerQueue) {
                    while (customerQueue.size() == 0) {
                        customerQueue.wait();
                    }
                    currentCustomer = customerQueue.poll();
                    customerQueue.notify();
                }

                System.out.println(this + " have start to serve " + currentCustomer);
                Thread.sleep(500 * currentCustomer.getTaskAmount());
                System.out.println(currentCustomer.getTaskAmount() + " task of " + customerQueue + " was served by " + this);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public String toString() {
        return getName();
    }
}
