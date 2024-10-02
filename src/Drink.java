public enum Drink { //Här deklareras enums
    KRANVATTEN ("kranvatten"),
    PROTEINDRYCK ("proteindryck"),
    MINERALVATTEN ("mineralvatten");

    public final String getDrink;

    Drink(String getDrink) {
        this.getDrink = getDrink;
    }

}
