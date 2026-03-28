import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        int maxSize= 5;
        Producer producer = new Producer(queue, maxSize);

        Consumer consumer1 = new Consumer(queue, maxSize);
        Consumer consumer2 = new Consumer(queue, maxSize);
        Consumer consumer3 = new Consumer(queue, maxSize);

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