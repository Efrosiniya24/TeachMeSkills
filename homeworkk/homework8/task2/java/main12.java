import java.util.Scanner;

public class main12 {
    public static void main(String[] args) {
//        Создать класс Apple и добавить в него поле color с модификатором доступа private и
//        инициализировать его. В методе main другого класса создать объект Apple, и не
//        используя сеттеры изменить значение поля color.

        Scanner sc = new Scanner(System.in);

        Apple apple = new Apple();
        System.out.println("Значение поля color до изменения: " + apple.getColor());

        System.out.print("Введите цвет яблока: ");
        String color = sc.nextLine();

        apple = new Apple(color);
        System.out.println("Значение поля color после изменения: " + apple.getColor());


    }
}
