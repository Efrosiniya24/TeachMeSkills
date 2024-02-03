package homowork29_SOLID.OCP;

public class Main {
    public static void main(String[] args) {
        Books books = new Books();
        Clothes clothes = new Clothes();

        books.setCharacteristic();
        books.setPrice();

        System.out.println();

        clothes.setCharacteristic();
        clothes.setPrice();
    }
}
