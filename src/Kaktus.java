import javax.swing.*;

public class Kaktus extends Växter{//SUBKLASS

    Drink drink = Drink.MINERALVATTEN;

    Kaktus(String name, double växtensHöjd) {
        super(name, växtensHöjd);
    }

    @Override
    public void beräknaVätska() {
        double dagligVätskeMängd = 0.02;
        JOptionPane.showMessageDialog(null,  getName() + " ska ha " + dagligVätskeMängd + "l " + drink.getDrink);
    }
}
