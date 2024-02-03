package homowork29_SOLID.LSP;

public class Dolphin extends Mammals{
    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость - 60км");
    }

    @Override
    public void myName() {
        System.out.println("Дельфин");
    }

    public void feature(){
        System.out.println("Постоянно живут в воде. Не дышат ртом");
    }
}
