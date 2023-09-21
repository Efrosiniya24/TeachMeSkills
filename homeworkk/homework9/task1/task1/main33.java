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

        Scanner sc = new Scanner(System.in);
        String food;

        Animal dog = new Dog();
        Animal tiger = new Tiger();
        Animal rabbit = new Rabbit();

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
