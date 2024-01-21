package homework31Pattern.Decorator;

public class Book implements Buy{
    @Override
    public void buy() {
        System.out.println("Купить книгу");
    }
}
