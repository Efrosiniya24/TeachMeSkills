package homework14;

import java.util.Scanner;
import java.util.function.Supplier;

public class Task5 {
    public static void main(String[] args) {
//        Задача 5:
//        Используя Supplier написать метод, который будет возвращать введенную с консоли
//        строку задом наперед.
        Scanner sc = new Scanner(System.in);

        Supplier<String> reverseLine= ()-> {
            System.out.print("Введите строку: ");
            String line = sc.nextLine();
            StringBuilder line1 = new StringBuilder(line).reverse();
           return String.valueOf(line1);
        };
        System.out.println("Строка задом напперед: "+reverseLine.get());
    }
}
