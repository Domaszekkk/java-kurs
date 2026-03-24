import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class Test {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 10, 15, 20);
        Predicate<Integer> isEven = (number) -> number % 2 == 0;
        List<Integer> result = Strumyk.filterNumbers(numbers, isEven);
        System.out.println(result);
        Function<String, String> trimFunction = (input) -> input.trim();
        Function<String, String> upperFunction = (input) -> input.toUpperCase();
        Function<String, String> combined = trimFunction.andThen(upperFunction);
        String text = " hello world ";

        String resultText = combined.apply(text);
        System.out.println(resultText);

        List<Employee> employees = Arrays.asList(
                new Employee("Jan", 30, "IT"),
                new Employee("Anna", 22, "HR"),
                new Employee("Kasia", 25, "HR"),
                new Employee("Piotr", 28, "IT"),
                new Employee("Kasia", 24, "Finance")
        );

        List<Employee> filtered = employees.stream()
                .filter(employee -> employee.age > 25)
                .toList();

        List<String> names = filtered.stream()
                .map(employee -> employee.name)
                .sorted()
                .toList();

        Map<String, List<Employee>> grouped = employees.stream()
                .collect(Collectors.groupingBy(employee -> employee.department));
        System.out.println(grouped);
        System.out.println(filtered);

        List<String> sentences = Arrays.asList(
                "hello world",
                "java streams",
                "world of code"
        );

        String word = sentences.stream()
                .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
                .distinct()
                .sorted()
                .collect(Collectors.joining(","));
        System.out.println(word);
    }
}