package homowork29_SOLID.ISP;

public class BlackForestCake implements Cooking,History, PeopleAndFood{

    @Override
    public void ingredients() {
        System.out.println("Ингредиенты торта Черный лес");
    }

    @Override
    public void cookingSteps() {
        System.out.println("Шаги приготовления торта: ");
    }

    @Override
    public void histotyOfDish() {
        System.out.println("История торта: ");
    }

    @Override
    public void comments() {
        System.out.println("Отзывы торта: ");
    }

    @Override
    public void quantityPeopleCooking() {
        System.out.println("Количество людей, выбравших данный рецепт: : ");
    }
}
