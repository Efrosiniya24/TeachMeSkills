import java.util.Random;
import java.util.Scanner;

public class lesson6 {
    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nВыберите задание:\n 1)\n 2)");
            int operation = sc.nextInt();
            switch (operation) {
                case 1 -> {
                    task1();
                }
                case 2 -> {
                    task2();
                }

                }
            }
        }

    static void task1(){
//        Задача 1:
//        1.1 Создать класс Calculator с полями weight, cost, color и заполнить их. И методами
//        нахождения суммы, разности, деления, умножения двух чисел. Метод main в этом классе
//        не создавать !
//                1.2 Создать объект класса Calculator в main методе другого класса. Проверить работу
//        методов и вывести в консоль значения полей weight, cost, color.
//        1.3 Создать конструктор для класса Calculator, чтобы иметь возможность
//        инициализировать поля в момент создания объекта. Также в логическом блоке добавить
//        вывод в консоль, создаётся объект Calculator



        Calculator calculator = new Calculator();

       System.out.println("Ваш вес: " + calculator.getWeight() + "\nСтоимость: "+ calculator.getCost() +"\nЦвет: "+ calculator.getColor());

       System.out.println("\n\nДля чисел 5 и 4 выполним математические операции");

       System.out.println("\nРазность: " + calculator.razn(5,4) + "\nСумма: "+ calculator.sum(5,4)
        + "\nПроизведение: " + calculator.sub(5, 4) +"\nДеление: " +calculator.del(5,4));

        System.out.println("\nСоздадим объект класса Calculator и выведем его параметры.");
        Calculator2 calculator2 = new Calculator2();
        calculator2.main();
    }


    static void task2(){
//        Задача 2:
//        2.1 Создать класс Person, который содержит: переменные fullName, age; методы
//        talk(String text) и move(), в которых вывести на консоль сообщение -"*fullName* talk
//                *text*..." и "*fullName* walk.".
//        2.2 Добавьте два конструктора - Person() и Person(fullName, age).
//        2.3 Создайте два объекта этого класса. Один объект инициализируется конструктором
//        Person(), другой - Person(fullName, age). Вызовите методы move() и talk()

        Person person = new Person();
        person.talk("Hello");
        person.move();

        Person person1 = new Person("Man", 23);
        person1.talk("Hello");
        person1.move();
    }

}

