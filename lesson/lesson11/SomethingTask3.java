package lesson11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SomethingTask3 {

    public void printYourNumber(){
        Scanner sc = new Scanner(System.in);
        int number = 0;

        while(true) {
            System.out.print("Введите число: ");
            try{
                number = sc.nextInt();
                break;
            }catch(InputMismatchException e){
                System.out.print("Необходимо ввести именно число( ");
                sc.next();
            }
        }
        System.out.println("Прекрасно! Вы ввели число!)");
    }

    public void printMassiv(){
        Scanner sc =new Scanner(System.in);
        int element = 0;
        int number = 0;
        int[] array = {5, 8, 9};
        while(true) {
            try {
                System.out.println("\nВыберите элемент массива(от 1 до 3");
                element = sc.nextInt();
                System.out.print("На сколько желаете поделить число:");
                number = sc.nextInt();
                System.out.print("Ваше полученное значение: " + (array[element-1]) / number);
                return;
            }catch(InputMismatchException e){
                System.out.println("Введите целое число");
                sc.next();
            }catch(ArithmeticException e){
                System.out.println("Ваше значение будет равно нулю( Не делите впредь на нуль, пожалуйста)");
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.print("упс... В массиве только 3 элемента...Повторите ввод");
            }
        }

    }

    public void task3(){
        Scanner sc =new Scanner(System.in);
        int element = 0;
        int number = 0;
        int[] array = {56, 88, 76,3485,28,6,13};
        while(true) {
            try {
                System.out.println("\nВыберите элемент массива(от 1 до 7)");
                element = sc.nextInt();
                System.out.print("Ваше элемент: " + array[element-1]);
                return;
            }catch(InputMismatchException | ArrayIndexOutOfBoundsException e) {
                System.out.println("Ошибка");
            }
        }
    }

    public void task4(){
        Scanner  sc = new Scanner(System.in);
        int number = 0;
        while(true){
            System.out.print("Укажите число меньше 20:");
            try {
                number = sc.nextInt();
                if(number < 20)
                    break;
                else System.out.println("Неправильно");
            }catch(InputMismatchException e){
                System.out.println("Нужно ввести именно число...");
                sc.next();
            }
            finally {
                System.out.println("___________");

            }
        }
        System.out.println("Замечательно!");
    }
}
