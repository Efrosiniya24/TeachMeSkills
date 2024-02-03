package homowork29_SOLID.LSP;

public class Cat extends Mammals{

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость - 50км");
    }

    @Override
    public void myName() {
        System.out.println("Кошка");
    }
}
