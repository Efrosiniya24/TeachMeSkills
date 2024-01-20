package homework30Pattern.AbstractFactory.Factory;

import homework30Pattern.AbstractFactory.*;

public class Cake implements CandyFactory {
    @Override
    public Chocolate createChocolate() {
        return new CakeChocolate();
    }

    @Override
    public Strawberry createStrawberry() {
        return new CakeStrawberry();
    }
}
