package homework31Pattern.Decorator;

public class BuyDecorator implements Buy {
    protected Buy buy;

    public BuyDecorator(Buy buy) {
        this.buy = buy;
    }

    @Override
    public void buy() {
        buy.buy();
    }
}
