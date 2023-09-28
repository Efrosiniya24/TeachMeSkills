package lesson11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
//        Задача 3:
//        Создать класс с как минимум 4 разными методами, в каждом методе добавить проверку
//        на исключительные ситуации, используя:
//        1. try- catch
//        2. try-catch, где catch будет несколько
//        3. try -catch, с использованием multi-catch
//        4. try-catch-finally
//        Продемонстрировать обработку исключительных ситуаций на примерах.
        Scanner sc = new Scanner(System.in);
        int operation = 0;
        SomethingTask3 something = new SomethingTask3();

        while(true){
            System.out.println("\nВыберите операцию:\n 1)\n 2)\n 3)\n 4)");
            try{
                operation = sc.nextInt();
            }catch(InputMismatchException e){
                System.out.print("Необходимо ввести число");
            }
            switch(operation){
                case 1->{
                   something.printYourNumber();
                }
                case 2->{
                    something.printMassiv();
                }
                case 3->{
                    something.task3();
                }
                case 4->{
                    something.task4();
                }
            }
        }
    }
}
