package lesson19.Task1;

public class Main {
    //    Задача 1:
//    Используя класс Thread создать поток Child который выводит числа от 1 до 100. В методе
//    main первой строкой вывести в консоль “Поток main начинает свою работу” затем создать
//    объект Child и запустить поток. Затем на последней строке метода main вывести в
//    консоль “Поток main завершает свою работу”. Посмотреть результат и сделать вывод
    public static void main(String[] args) {
        System.out.println("Поток main начинает свою работу");
        Child child = new Child();
        child.start();
        System.out.println("Поток main завершает свою работу");
    }
}
