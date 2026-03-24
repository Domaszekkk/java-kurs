import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class Test {
    public static void main(String[] args) {
//        tworze liste z liczbami dlatego asList
        List<Integer> numbers = Arrays.asList(1, 2, 3, 10, 15, 20);
//      sprawdza czy liczba jes parzysta czy nie
        Predicate<Integer> isEven = (number) -> number % 2 == 0;
    //wywołuje metode i przekazuje do niej liczby z listy i sprawdzenie czy są parzyste czy nie
        List<Integer> result = Strumyk.filterNumbers(numbers, isEven);
        System.out.println(result);
//        tworze funckje która usuwa spacje
        Function<String, String> trimFunction = (input) -> input.trim();
//        teraz funkcje która dodaje capslock
        Function<String, String> upperFunction = (input) -> input.toUpperCase();
//        łącze je w jedną
        Function<String, String> combined = trimFunction.andThen(upperFunction);
        String text = " hello world ";
//        i teraz mogę uzyć jednej funckji zamiast dwóch
        String resultText = combined.apply(text);
        System.out.println(resultText);
//      tworze liste pracowników
        List<Employee> employees = Arrays.asList(
                new Employee("Jan", 30, "IT"),
                new Employee("Anna", 22, "HR"),
                new Employee("Kasia", 25, "HR"),
                new Employee("Piotr", 28, "IT"),
                new Employee("Kasia", 24, "Finance")
        );
//        filtruje pracowników którzy mają wiecej niz 25 lat
        List<Employee> filtered = employees.stream()
                .filter(employee -> employee.age > 25)
                .toList();
//        mapuje employee na imiona sortuje alfabetycznie i wrzucam do listy
        List<String> names = filtered.stream()
                .map(employee -> employee.name)
                .sorted()
                .toList();
//        grupuje pracowników na ich działy
        Map<String, List<Employee>> grouped = employees.stream()
                .collect(Collectors.groupingBy(employee -> employee.department));
        System.out.println(grouped);
        System.out.println(filtered);
//      tworze liste słów
        List<String> sentences = Arrays.asList(
                "hello world",
                "java streams",
                "world of code"
        );
//        robie stream sentences, robię flat map żeby nie robić tablicy i sentence.split robie streamem bo normalnie
//        oddaje nam tablice, usuwam duplikaty, sortuje alfabetycznie i łącze w jednego stringa po przecinku
        String word = sentences.stream()
                .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
                .distinct()
                .sorted()
                .collect(Collectors.joining(","));
        System.out.println(word);
    }
}
