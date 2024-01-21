package homework31Pattern.Decorator;

public class CancelBuyDecorator extends BuyDecorator{
    public CancelBuyDecorator(Buy buy) {
        super(buy);
    }

    @Override
    public void buy() {
        buy.buy();
        System.out.println("Отмена покупки");
    }
}
