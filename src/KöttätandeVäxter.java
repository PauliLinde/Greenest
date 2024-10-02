import javax.swing.*;

public class KöttätandeVäxter extends Växter{//SUBKLASS

    Drink drink = Drink.PROTEINDRYCK;

    KöttätandeVäxter(String name, double växtensHöjd) {
        super(name, växtensHöjd);
    }

    @Override
    public void beräknaVätska() {
       double dagligVätskeMängd = 0.1 + (this.getVäxtensHöjd() * 0.2);
        JOptionPane.showMessageDialog(null,  getName() + " ska ha " + dagligVätskeMängd + "l " + drink.getDrink);
    }
}
