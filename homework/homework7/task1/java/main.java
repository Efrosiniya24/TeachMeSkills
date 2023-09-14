import java.util.Scanner;

public class main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        while(true){
            System.out.println("\nВыберите задание:\n 1)\n 2)\n 3)Выход");
            int operstion = sc.nextInt();
            switch(operstion) {
                case 1 -> {
                    task1();
                }
                case 2 -> {
                    task2();
                }
                case 3 ->{
                    return ;
                }
            }
        }
    }

    static public void task1(){
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

    static public void task2(){
//        Задача 2:
//        Написать иерархию классов Фигура, Треугольник, Прямоугольник, Круг. Реализовать
//        функцию подсчета площади для каждого типа фигуры и подсчет периметра(используя
//        абстрактный класс/методы). Создать массив из 5 разных фигур. Вывести на экран сумму
//        периметра всех фигур в массиве


    }
}
