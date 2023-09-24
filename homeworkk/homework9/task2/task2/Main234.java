import java.util.Scanner;

public class Main234 {
    public static void main(String[] args) {
//        Задача *:
//        Написать такой конструктор, который запретит создание объекта класса Dog в других
//                классах; Найти способ вызывать методы voice(), eat() класса Dog, который позволит
//        обойти ограничение, наложенное конструктором выше. Объяснить, как работают оба
//        способа

        Scanner sc = new Scanner(System.in);
        String food;

        //Dog1 dog = new Dog();
        Dog1 dog = Dog1.create();
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
