package homowork29_SOLID.LSP;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dolphin dolphin = new Dolphin();

        cat.descriptionOfMammals();
        System.out.println();
        cat.myName();
        cat.maxSpeed();
        System.out.println();

        dolphin.myName();
        dolphin.maxSpeed();
        dolphin.feature();
    }
}
