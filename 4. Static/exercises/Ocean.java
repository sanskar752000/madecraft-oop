package exercises;

public class Ocean {

    public static void main(String[] args) {

        SeaCreature spongebob = new SeaCreature("Spongebob");
        spongebob.eat();
        spongebob.laugh();


        SeaCreature patrick = new SeaCreature("Patrick");
        System.out.println(patrick.getName());
        System.out.println(patrick);

        patrick.laugh();

        SeaCreature squidward = new SeaCreature("Squidward");
        System.out.println(squidward.getName());

        squidward.laugh();
    }
}
