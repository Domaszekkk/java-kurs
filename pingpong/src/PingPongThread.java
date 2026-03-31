public class PingPongThread implements Runnable {
    private final String text;

    public PingPongThread(String text) {
        this.text = text;
    }

    @Override
    public void run() {
        int i = 0;
        while (i < 10) {
            System.out.println(text);
            i++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
