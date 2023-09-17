import java.util.Scanner;

public class main1 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
//        Задача 1:
//        Создать классы "Директор", "Рабочий", "Бухгалтер". Реализовать интерфейс с методом,
//        который печатает название должности и имплементировать этот метод в созданные классы.

        Worker worker = new Worker();
        Director director = new Director();
        Accountant accountant = new Accountant();

        worker.printPost();
        director.printPost();
        accountant.printPost();
    }
}
