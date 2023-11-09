package lesson19.Task2;

import lesson19.Task1.Child;

public class Main {
    //    Задача 2:
//    С помощью метода join() изменить предыдущий код таким образом, чтобы надпись “Поток
//    main завершает свою работу” всегда была последней.
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Поток main начинает свою работу");
        lesson19.Task1.Child child = new Child();
        child.start();
        child.join();
        System.out.println("Поток main завершает свою работу");
    }
}
