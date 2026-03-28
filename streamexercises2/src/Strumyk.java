import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Strumyk {

    public static List<Integer> filterNumbers(List<Integer> numbers, Predicate<Integer> predicate) {
        List<Integer> result = new ArrayList<>();
        for (Integer number : numbers) {
            if (predicate.test(number)) {
                result.add(number);
            }
        }
        return result;
    }
}