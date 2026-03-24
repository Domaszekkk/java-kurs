import java.util.Arrays;
import java.util.StringJoiner;

public class Smartfon extends Komorka {
    Osoba[] znajomi;

    public Smartfon(Osoba[] znajomi) {
        this.znajomi = znajomi;
    }

    @Override
    public void wyswietlHistoriePolonczen() {
            Arrays.stream(historia)
                    .map(number -> formatNumber(number))
                    .forEach(formatNumber -> System.out.println(formatNumber));
        }

    private String formatNumber(String number) {
        return Arrays.stream(znajomi)
                .filter(osoba -> osoba != null && osoba.getNumer().equals(number))
                .findFirst()
                .map(osoba -> String.format("%s %s %s %n", osoba.getImie(), osoba.getNazwisko(), number))
                .orElse(number);
    }
}