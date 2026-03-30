import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class Consumer implements Runnable {
    private final Queue<Integer> queue;
    private final Lock lock;
    private final Condition notFull;
    private final Condition notEmpty;

    public Consumer(Queue<Integer> queue, int maxSize, Lock lock, Condition notFull, Condition notEmpty) {
        this.queue = queue;
        this.lock = lock;
        this.notFull = notFull;
        this.notEmpty = notEmpty;
    }

    public void run() {
        while (true) {
            lock.lock();
            try {
                while (queue.isEmpty()) {
                    notEmpty.await();
                }
                int value = queue.poll();
                System.out.printf("consumed: %d size: %d%n", value, queue.size());
                notFull.signalAll();
            } catch (InterruptedException e) {
                throw new RuntimeException();
            } finally {
                lock.unlock();
            }

            try {
                Thread.sleep(1200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}