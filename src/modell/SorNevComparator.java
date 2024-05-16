package modell;

import java.util.Comparator;

 public class SorNevComparator implements Comparator<Sor> {
    @Override
    public int compare(Sor sor1, Sor sor2) {
        // Az összehasonlítás logikája a sor neve szerint
        return sor1.getNev().compareTo(sor2.getNev());
    }
}
