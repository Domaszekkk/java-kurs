import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class Producer implements Runnable {
    private final Queue<Integer> queue;
    private final int maxSize;
    private final Lock lock;
    private final Condition notFull;
    private final Condition notEmpty;

    public Producer(Queue<Integer> queue, int maxSize, Lock lock, Condition notFull, Condition notEmpty) {
        this.queue = queue;
        this.maxSize = maxSize;
        this.lock = lock;
        this.notFull = notFull;
        this.notEmpty = notEmpty;
    }

    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            lock.lock();
            try {
                while (queue.size() == maxSize) {
                    notFull.await();
                }
                queue.add(i);
                System.out.println("produced: " + i + " size: " + queue.size());
                notEmpty.signalAll();
            } catch (InterruptedException e) {
                throw new RuntimeException();
            } finally {
                lock.unlock();
            }
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException();
            }
        }
    }
}