package State;

public class Main {

    public static void main(String[] args) {
        Man man = new Man("Дмитрий", 65);
        System.out.println();

        man.changeState(new Man.StateRest(man));
        man.getManStatement().manState();

        System.out.println();

        man.changeState(new Man.AverageLoad(man));
        man.getManStatement().manState();
        System.out.println();

        man.changeState(new Man.HighLoad(man));
        man.getManStatement().manState();
    }
}
