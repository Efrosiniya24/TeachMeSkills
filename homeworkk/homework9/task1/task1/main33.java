import java.util.Scanner;

public class main33 {
    public static void main(String[] args) {
//        Задача 1:
//        Создать логически верную иерархию следующих классов: Animal, Dog, Tiger, Rabbit.
//                Переопределить методы voice(), eat(String food) чтобы они выводили верную
//        информацию. Метод eat может принимать “Meat”, “Grass” и другие строки.
//                Например, если мы создадим объект класса Rabbit, вызовем метод eat() и передадим
//        туда “Grass” он должен написать в консоли что любит есть травку. Если передадим “Meat”
//        или другую строку то он будет недоволен


//        Задача *:
//        Написать такой конструктор, который запретит создание объекта класса Dog в других
//                классах; Найти способ вызывать методы voice(), eat() класса Dog, который позволит
///       обойти ограничение, наложенное конструктором выше. Объяснить, как работают оба
//        способа

        Scanner sc = new Scanner(System.in);
        String food;

        Animal1 dog = new Dog();
        Animal1 tiger = new Tiger();
        Animal1 rabbit = new Rabbit1();

        //dog
        dog.voice();
        System.out.print("I'm eat: ");
        food = sc.nextLine();
        dog.eat(food);

        //tiger
        tiger.voice();
        System.out.print("I'm eat: ");
        food = sc.nextLine();
        tiger.eat(food);


        //rabbit
        rabbit.voice();
        System.out.print("I'm eat: ");
        food = sc.nextLine();
        rabbit.eat(food);
    }
}
