public class Komorka extends Telefon {
    int index;

    String[] historia = new String[10];

    @Override
    public void zadzwon(String number) throws WrongNumberFormatException {
        if (index >= historia.length) {
            throw new CallersHistoryIsFullException("historia jest pełna mordko");
        }
        super.zadzwon(number);
        historia[index] = number;
        index++;
    }

    @Override
    public void wyswietlHistoriePolonczen() {
        for (int i = 0; i < index; i++) {
            System.out.println(historia[i]);
        }
        if (index == 0) {
            System.out.println("brak historii ");
        }
    }
}