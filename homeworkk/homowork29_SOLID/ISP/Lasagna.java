package homowork29_SOLID.ISP;

public class Lasagna implements Cooking{
    @Override
    public void ingredients() {
        System.out.println("Ингредиенты лазаньи");
    }

    @Override
    public void cookingSteps() {
        System.out.println("Шаги приготовления лазаньи: ");
    }
}
