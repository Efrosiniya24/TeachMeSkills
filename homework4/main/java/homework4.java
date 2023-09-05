import java.util.InputMismatchException;
import java.util.Scanner;

public class homework4 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int operation = 0;
        while(true){
            System.out.println("Выберите задание:\n 1)\n 2)\n 3)\n 4)\n 5)\n 6)\n 7)");

            try{
                operation = sc.nextInt();
            }
            catch(InputMismatchException e){
            }
            switch(operation){
                case 1->{
                    task1();
                }
                case 2->{
                    task2();
                }
                case 3->{
                    task3();
                }
                case 4->{
                    task4();
                }
                case 5->{
                    task5();
                }
                case 6->{
                    task6();
                }
                case 7->{
                    task7();
                }
            }
        }
    }

    static void task1(){
//        Задача 1:
//        Пройти по массиву, вывести все элементы в прямом и в обратном порядке.

        System.out.print("Введите размер массива:");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.print("Элементы массива в прямом порядке: ");
        for(int i = 0; i< size; i++){
            array[i] = (int) (Math.random()*20);
            System.out.print(array[i] + " ");
        }

        System.out.print("\nЭлементы массива в  обратном порядке: ");
            for(int i = size - 1; i >-1; i--)
                System.out.print(array[i] + " ");
    }
    static void task2(){
//        Задача 2:
//        Найти минимальный-максимальный элементы и вывести в консоль.

        System.out.print("Введите размер массива:");
        int size = sc.nextInt();

        System.out.println("Введите элементы массива: ");

        int[] array = new int[size];

        for(int i =0; i<size; i++)
            array[i] = sc.nextInt();

        int max = array[0];
        int min = array[0];

        for(int a : array)
            if(a> max)
                max = a;
            else
            if(a< min)
                min = a;

        System.out.println("Максимальный элемент: " + max + " \nМинимальный элемент: "+ min);
    }
    static void task3(){
//        Задача 3:
//        Найти индексы минимального и максимального элементов и вывести в консоль.
    }
    static void task4(){
//        Задача 4:
//        Найти и вывести количество нулевых элементов. Если нулевых элементов нет - вывести
//        сообщение, что их нет.


    }
    static void task5(){
//        Задача 5:
//        Пройти по массиву и поменять местами элементы первый и последний, второй и
//        предпоследний и т.д.
    }
    static void task6(){
//        Задача 6:
//        Проверить, является ли массив возрастающей последовательностью (каждое следующее
//        число больше предыдущего)
    }
    static void task7(){
//        Задача *:
//        Имеется массив из неотрицательных чисел(любой). Представьте что массив
//        представляет целое число (Например массив {1,2,3} -> 123, {9,9,9} -> 999). Задача
//        добавить единицу к этому “числу” и на выходе получить исправленный массив. Массив не
//        содержит нуля в начале, кроме самого числа 0.
//        Пример:
//        Input: [1,4,0,5,6,3]
//        Output: [1,4,0,5,6,4]
//        Input: [9,9,9]
//        Output: [1,0,0,0]
    }
}
