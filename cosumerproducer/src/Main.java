import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        int maxSize= 5;
        Producer producer = new Producer(queue, maxSize);

        Consumer consumer1= new Consumer(queue, maxSize);
        Consumer consumer2= new Consumer(queue, maxSize);
        Consumer consumer3= new Consumer(queue, maxSize);
    }
}