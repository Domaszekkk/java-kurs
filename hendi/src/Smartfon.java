public class Smartfon extends Komorka {
    Osoba[] znajomi;

    public Smartfon(Osoba[] znajomi) {
        this.znajomi = znajomi;
    }
    @Override
    public void wyswietlHistoriePolonczen() {
        for (int i = 0; i < index; i++) {
            String number = historia[i];
            boolean found = false;
            for (Osoba osoba : znajomi) {
                if (osoba != null && osoba.getNumer().equals(number)) { {
                    found = true;
                    System.out.println(
                            Osoba.getImie() + " " +
                            Osoba.getNazwisko() + " " +
                            number
                    );
                    break;
                }
            }
            if(!found) {
                System.out.println(number);
            }
        }
    }
}
