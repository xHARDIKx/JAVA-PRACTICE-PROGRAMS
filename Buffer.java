import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;

public class Buffer {
    public static void main(String[] args) throws InterruptedException {
        final Buffer buffer = new Buffer();
        Thread t1 = new Thread(() -> {
            try {
                buffer.producer();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                buffer.consumer();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }

    private ArrayBlockingQueue<Integer> list = new ArrayBlockingQueue<>(10);
    private final int LIMIT = 10;
    private final Object lock = new Object();

    public void producer() throws InterruptedException {
        int value = 0;
        while (true) {
            synchronized (lock) {
                while (list.size() == LIMIT) {
                    lock.wait();
                }

                list.add(value);
                System.out.println("Producer added: " + value + " queue size is " + list.size());
                value++;
                lock.notify();
            }
        }
    }

    public void consumer() throws InterruptedException {
        Random random = new Random();
        while (true) {
            synchronized (lock) {
                while (list.size() == 0) {
                    lock.wait();
                }
                int value = list.remove();
                System.out.print("Removed value by consumer is: " + value);
                System.out.println(" Now list size is: " + list.size());
                lock.notify();
            }

            Thread.sleep(random.nextInt(1000));
        }
    }
}
