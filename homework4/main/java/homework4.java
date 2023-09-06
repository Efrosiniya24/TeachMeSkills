import org.w3c.dom.ls.LSOutput;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.Math.pow;

public class homework4 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int operation = 0;
        while(true){
            System.out.println("\nВыберите задание:\n 1)\n 2)\n 3)\n 4)\n 5)\n 6)\n 7)");

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

        int size = 0;

        System.out.print("Введите размер массива:");
        while(true) {
            try {
                size = sc.nextInt();
                break;
            }catch(InputMismatchException e){
                System.out.print("Введите корректное значение: ");
            }
        }
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

        int size = 0;

        System.out.print("Введите размер массива:");
        while(true) {
            try {
                size = sc.nextInt();
                break;
            }catch(InputMismatchException e){
                System.out.print("Введите корректное значение: ");
                sc.next();
            }
        }

        System.out.println("Введите элементы массива: ");

        int[] array = new int[size];

        for(int i =0; i<size; i++) {
            try {
                array[i] = sc.nextInt();
            }catch(InputMismatchException e){
                System.out.print("Введите корректное значение: ");
                i--;
                sc.next();
            }
        }

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

        int size = 0;

        System.out.print("Введите размер массива:");
        while(true) {
            try {
                size = sc.nextInt();
                break;
            }catch(InputMismatchException e){
                System.out.print("Введите корректное значение: ");
                sc.next();
            }
        }

        int[] array = new int[size];

        System.out.print("Элементы массива: ");
        for(int i = 0; i< size; i++){
            array[i] = (int) (Math.random()*20);
            System.out.print(array[i] + " ");
        }

        int max = array[0];
        int min = array[0];
        int indexMax = 0;
        int indextMin = 0;

        for(int i = 0; i< size; i++)
            if(array[i]> max) {
                max = array[i];
                indexMax = i;
            }
            else
            if(array[i]< min) {
                min = array[i];
                indextMin = i;
            }

        System.out.println("\nИндекс максимального элемента: " + indexMax + " \nИндекс минимального элемента: "+ indextMin);

    }
    static void task4(){
//        Задача 4:
//        Найти и вывести количество нулевых элементов. Если нулевых элементов нет - вывести
//        сообщение, что их нет.

        int size = 0;

        System.out.print("Введите размер массива:");
        while(true) {
            try {
                size = sc.nextInt();
                break;
            }catch(InputMismatchException e){
                System.out.print("Введите корректное значение: ");
                sc.next();
            }
        }

        System.out.println("Введите элементы массива: ");

        int[] array = new int[size];

        for(int i =0; i<size; i++) {
            try {
                array[i] = sc.nextInt();
            }catch(InputMismatchException e){
                System.out.print("Введите корректное значение: ");
                i--;
                sc.next();
            }
        }

        int kol = 0;
        for(int a: array)
            if(a == 0)
                kol++;
        if(kol == 0)
            System.out.println("Нулевых элементов нет(");
        else
            System.out.println("Количество нулевых элементов: "+ kol);

    }
    static void task5(){
//        Задача 5:
//        Пройти по массиву и поменять местами элементы первый и последний, второй и
//        предпоследний и т.д.

        int size = 0;

        System.out.print("Введите размер массива:");
        while(true) {
            try {
                size = sc.nextInt();
                break;
            }catch(InputMismatchException e){
                System.out.print("Введите корректное значение: ");
                sc.next();
            }
        }

        int[] array = new int[size];

        System.out.print("Элементы массива: ");
        for(int i = 0; i< size; i++){
            array[i] = (int) (Math.random()*20);
            System.out.print(array[i] + " ");
        }

        int temp = 0;
        for(int i = 0, j = size-1; i <size/2; i++, j--){
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }

        System.out.print("\nСформировавшийся массив: ");
        for (int a: array)
            System.out.print( a + " ");
    }
    static void task6(){
//        Задача 6:
//        Проверить, является ли массив возрастающей последовательностью (каждое следующее
//        число больше предыдущего)

        int size = 0;

        System.out.print("Введите размер массива:");
        while(true) {
            try {
                size = sc.nextInt();
                break;
            }catch(InputMismatchException e){
                System.out.print("Введите корректное значение: ");
                sc.next();
            }
        }

        int[] array = new int[size];

        System.out.println("Введите элементы массива: ");
        for(int i =0; i<size; i++) {
            try {
                array[i] = sc.nextInt();
            }catch(InputMismatchException e){
                System.out.print("Введите корректное значение: ");
                i--;
                sc.next();
            }
        }

        int i = 1;
        for(; i<size; i++)
            if(array[i] < array[i-1])
                break;

        if(i == size)
            System.out.println("Массив является возрастающей последовательностью");
            else
            System.out.println("Массив НЕ является возрастающей последовательностью");
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

        int size = 0;

        System.out.print("Введите размер массива:");
        while(true) {
            try {
                size = sc.nextInt();
                break;
            }catch(InputMismatchException e){
                System.out.print("Введите корректное значение: ");
                sc.next();
            }
        }

        int[] array = new int[size];

        System.out.println("Введите элементы массива: ");
        for(int i =0; i<size; i++) {
            try {
                array[i] = sc.nextInt();
            }catch(InputMismatchException e){
                System.out.print("Введите корректное значение: ");
                i--;
                sc.next();
            }
        }

        int number = 0;
        for(int i = 0 ; i <size; i++)
            number += array[i]* (int)(pow(10, size-i));

        number /= 10;
       number+=1;
        System.out.print("Полученный массив: ");
        for(int i = 0; i < size; i++) {
            array[i] = number / (int) (pow(10, size - (i+1)));
            System.out.println(array[i]);
                number  %= (int)(pow(10, size - (i+1)));
        }

        for(int a:array)
            System.out.print(a + " ");
    }
}
