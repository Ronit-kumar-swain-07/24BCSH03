/*
12.	Write a java program in which main thread should create two child threads (Producer and Consumer). 
First child thread (Producer) should produce ten random integers between 1 to 100 and the second child thread (Consumer) 
should check whether the generated number is even or odd. At the end the second child thread (Consumer) should print total 
number of even numbers received. Both the threads should wait and notify each other wherever necessary.
*/

//Code:
import java.util.Random;

class Shared {
    int num;
    boolean available = false;
}

class Producer extends Thread {
    Shared s;
    Random r = new Random();

    Producer(Shared s) {
        this.s = s;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            synchronized (s) {
                while (s.available) {
                    try {
                        s.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
                s.num = r.nextInt(100) + 1;
                System.out.println("Producer generated: " + s.num);
                s.available = true;
                s.notify();
            }
        }
    }
}

class Consumer extends Thread {
    Shared s;
    int evenCount = 0;

    Consumer(Shared s) {
        this.s = s;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            synchronized (s) {
                while (!s.available) {
                    try {
                        s.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
                System.out.println("Consumer received: " + s.num + " -> " +
                        (s.num % 2 == 0 ? "Even" : "Odd"));
                if (s.num % 2 == 0)
                    evenCount++;
                s.available = false;
                s.notify();
            }
        }
        System.out.println("Total even numbers received by Consumer: " + evenCount);
    }
}

public class Q12 {
    public static void main(String[] args) {
        Shared s = new Shared();
        Producer p = new Producer(s);
        Consumer c = new Consumer(s);
        p.start();
        c.start();
        try {
            p.join();
            c.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}