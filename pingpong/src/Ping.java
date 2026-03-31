public class Ping {
    public static void main(String[] args) {
        Thread ping = new Thread(new PingPongThread("Ping"));
        Thread pong = new Thread(new PingPongThread("Pong"));
        ping.start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        pong.start();
    }
}