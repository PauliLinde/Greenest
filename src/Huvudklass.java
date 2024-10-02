import javax.swing.*;
import java.util.Arrays;
import java.util.List;

public class Huvudklass {

    Huvudklass() {

        Växter igge = new Kaktus("Igge", 0.02);
        Växter laura = new Palm("Laura", 5);
        Växter meatloaf = new KöttätandeVäxter("Meatloaf", 0.7);
        Växter olof = new Palm("Olof", 1);
        List<Växter> hotellGäster = Arrays.asList(igge, laura, meatloaf, olof);

        while (true) {
            String växtAttVattna = JOptionPane.showInputDialog(null, "Ange namn på växten du vill vattna");
            if (växtAttVattna == null) {
                break;
            }
            for (Växter h : hotellGäster) {
                if (h.getName().equalsIgnoreCase(växtAttVattna)) {
                        h.beräknaVätska();
                }
                else if (!h.getName().equalsIgnoreCase(växtAttVattna)) {
                    JOptionPane.showMessageDialog(null, "Hittade inte växten med det namnet");
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {

        Huvudklass h = new Huvudklass();
    }
}