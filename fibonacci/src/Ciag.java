import java.util.HashMap;
import java.util.Map;

public class Ciag {
    private static final Map<Integer, Integer> memo = new HashMap<>();

    public static void main(String[] args) {
        int n = 10;
        System.out.println(fibRec(n));
    }
    public static int fibRec(int n) {
        if (n <= 1) {
            return 1;
        }
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        int wynik = fibRec(n -1 ) + fibRec(n - 2);
        memo.put(n, wynik);
        return wynik;
    }
}


