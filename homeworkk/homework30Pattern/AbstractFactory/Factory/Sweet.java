package homework30Pattern.AbstractFactory.Factory;

import homework30Pattern.AbstractFactory.*;

public class Sweet implements CandyFactory {
    @Override
    public Chocolate createChocolate() {
        return new SweetChocolate();
    }

    @Override
    public Strawberry createStrawberry() {
        return new SweetStrawberry();
    }
}
