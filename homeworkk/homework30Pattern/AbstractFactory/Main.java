package homework30Pattern.AbstractFactory;

import homework30Pattern.AbstractFactory.Factory.Biscuits;
import homework30Pattern.AbstractFactory.Factory.Cake;
import homework30Pattern.AbstractFactory.Factory.Sweet;

public class Main {
    public static void main(String[] args) {
        Biscuits biscuits = new Biscuits();
        Cake cake = new Cake();
        Sweet sweet = new Sweet();

        biscuits.createChocolate();
        cake.createStrawberry();
        sweet.createChocolate();
    }
}
