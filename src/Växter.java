public abstract class Växter implements Vattna{ //SUPERKLASS
    private String name;
    private double växtensHöjd; //Växtens höjd i meter


    Växter(String name, double växtensHöjd){
        this.name = name;
        this.växtensHöjd = växtensHöjd;
    }
//Här sker inkapsling
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVäxtensHöjd() {
        return växtensHöjd;
    }

    public void setVäxtensHöjd(double växtensHöjd) {
        this.växtensHöjd = växtensHöjd;
    }

}
