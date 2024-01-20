package homework30Pattern.AbstractFactory.Factory;

import homework30Pattern.AbstractFactory.*;

public class Biscuits implements CandyFactory {
    @Override
    public Chocolate createChocolate() {
        return new BiscuitsChocolate();
    }

    @Override
    public Strawberry createStrawberry() {
        return new BiscuitsStrawberry();
    }
}
