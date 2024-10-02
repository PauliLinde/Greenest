import javax.swing.*;

public class Palm extends Växter{//SUBKLASS

    Drink drink = Drink.KRANVATTEN;

    public
    Palm(String name, double växtensHöjd) {
        super(name, växtensHöjd);
    }

    public void beräknaVätska() {
        double dagligVätskeMängd = this.getVäxtensHöjd() * 0.5; //Palmen ska få 0.5l per meter
        JOptionPane.showMessageDialog(null,  getName() + " ska ha " + dagligVätskeMängd + "l " + drink.getDrink);
    }

}
