package lesson19.Task3;

import lesson19.Task1.Child;

public class Main {
    //    Задача 3:
//    Переписать предыдущий код используя интерфейс Runnable.
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Поток main начинает свою работу");
        Child child = new Child();
        Thread thread = new Thread(child);
        thread.start();
        thread.join();
        System.out.println("Поток main завершает свою работу");
    }
}
