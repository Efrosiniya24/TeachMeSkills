package homework31Pattern.Decorator;

public class Main {
    public static void main(String[] args) {
        Buy book = new Book();
        book.buy();
        Buy cancelBook = new CancelBuyDecorator(book);
        cancelBook.buy();
    }
}
