package modell;

import java.util.Comparator;

public class SorMalataComparator implements Comparator<Sor> {
    @Override
    public int compare(Sor sor1, Sor sor2) {
        // Az összehasonlítás logikája a sor malátája szerint
        return sor1.getMalata() - sor2.getMalata();
    }
}
