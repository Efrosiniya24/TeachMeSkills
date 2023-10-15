package Task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int operation = 0;

        while(true){
            System.out.println("\nМеню:\n 1)Просмотреть коллекцию животных\n " +
                    "2) Добввить животное в коллекцию\n 3)Удалить животное из коллекции\n 4) Выход");
            try {
               operation = sc.nextInt();
            }catch (InputMismatchException e) {
                System.out.println("Введите целое число");
                sc.next();
            }

            switch (operation){
                case 1-> Animals.review();
                case 2 -> {
                    System.out.println("Введите животное: ");
                    String animal = sc.next();
                    Animals.add(animal);
                }
                case 3-> Animals.delete();
                case 4 -> {return;}
            }
        }

    }
}
