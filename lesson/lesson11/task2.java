package lesson11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class task2 {
//    Задача 2:
//    Создать собственное исключение которое будет выбрасываться в классе Person при
//    создании объекта, если ему меньше 18 лет. Попробовать создать объект Person до и
//    после 18 лет в методе main.

    public static void main(String[] args) throws PersonTask2Exeption{
        Scanner sc = new Scanner(System.in);
        int age = 0;
        PersonTask2 person;
        while(true) {
            System.out.print("Введите Ваш возраст: ");
            try {
                age = sc.nextInt();
                    person = new PersonTask2(age);
                    person.myage(age);
                    System.out.print("Ваш возраст подходит) ");
                    break;
            } catch (InputMismatchException e) {
                System.out.println("Введите целое число");
                sc.next();
            }catch (PersonTask2Exeption e){
            }
        }
    }
}
