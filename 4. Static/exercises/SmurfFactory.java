package exercises;

public class SmurfFactory {
    public static void main(String[] args) {
        Smurf.createSmurf("handy");
        Smurf.createSmurf("wandy");
        Smurf.createSmurf("candy");
        Smurf.createSmurf("sandy");

        Smurf handy = new Smurf("handy");
        handy.printName();
        handy.eat();
    }
}
