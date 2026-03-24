public class Telefon {

    public void zadzwon(String numer) throws WrongNumberFormatException {
        if (!numer.matches("\\d{3}-\\d{3}-\\d{3}"))
            throw new WrongNumberFormatException("zły format numeru");
        System.out.println("dzwonie na: " + numer);
    }

    public void wyswietlHistoriePolonczen() {
        System.out.println("brak historii ");
    }
}