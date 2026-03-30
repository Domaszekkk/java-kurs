import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        int maxSize= 5;

        Lock lock = new ReentrantLock();
        Condition notFull = lock.newCondition();
        Condition notEmpty = lock.newCondition();

        Producer producer = new Producer(queue, maxSize, lock, notFull, notEmpty);
        Consumer consumer1 = new Consumer(queue, maxSize, lock, notFull, notEmpty);
        Consumer consumer2 = new Consumer(queue, maxSize, lock, notFull, notEmpty);
        Consumer consumer3 = new Consumer(queue, maxSize, lock, notFull, notEmpty);

        Thread p = new Thread(producer);
        Thread c1 = new Thread(consumer1);
        Thread c2 = new Thread(consumer2);
        Thread c3 = new Thread(consumer3);
        p.start();
        c1.start();
        c2.start();
        c3.start();
    }
}