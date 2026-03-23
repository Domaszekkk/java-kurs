public class Test {
    public static void main(String[] args) {

        Osoba[] znajomi = {
                new Osoba("Jan", "Kowalski", "123-456-789"),
                new Osoba("Anna", "Nowak", "111-222-333")
        };

        Telefon t1 = new Telefon();
        Komorka t2 = new Komorka();
        Smartfon t3 = new Smartfon(znajomi);

        Telefon[] telefony = {t1, t2, t3};

        String[] numery = {
                "gjg-gjg-gjg",
                "123-456-789", // znajomy
                "999-999-999",
                "111-222-333", // znajomy
                "888-888-888",
                "777-777-777",
                "666-666-666",
                "555-555-555",
                "444-444-444",
                "333-333-333",
                "222-222-222",
                "gww-ewe-wew"
        };

        for (Telefon telefon : telefony) {
            System.out.println("nowy hendi");

            for (String numer : numery) {
                try {
                    telefon.zadzwon(numer);
                } catch (WrongNumberFormatException | CallersHistoryIsFullException e) {
                    System.out.println(e.getMessage());
                }
            }
        }

        for (Telefon telefon : telefony) {
            System.out.println("historia połączeń");
            telefon.wyswietlHistoriePolonczen();
        }
    }
}