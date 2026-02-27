import java.util.HashMap;
import java.util.Map;

public class Ciag {
    private static final Map<Integer, Long > memo = new HashMap<>();

    public static void main(String[] args) {
        int n = 10;
        System.out.println(fibRec(n));
    }
    public static Long fibRec(int n) {
        if (n <= 1) {
            return 1L;
        }
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        Long wynik = fibRec(n -1 ) + fibRec(n - 2);
        memo.put(n, wynik);
        return wynik;
    }
}