package org.example;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Main {
 static Scanner sc =new  Scanner(System.in);
    public static void main(String[] args) {
        while(true) {
            System.out.println("ВЫберите номер задания");
            int a = sc.nextInt();
            switch (a) {
                case 1:
                    task1();
                    break;
                case 2:
                    task2();
                    break;
                case 3:
                    task3();
                    break;
                case 4:
                    task4();
                    break;
                case 5:
                    task5();
                    break;
                case 6:
                    task6();
                    break;
                case 7:
                    task7();
                    break;
                case 8 :
                    task8();
                    break;
            }
            System.out.println("\nХотите выйти?\n1)Да\n2)Нет\n");
            int question = sc.nextInt();
            if(question == 1)
            {
                System.out.println("Программа успешно завершена)");
                return;
            }
        }
    }

    static void task1(){
        System.out.println("Введите число от 1 до 12");
        int number = sc.nextInt();
        switch(number){
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;
            default:
                System.out.println("Вы ввели неверное значение");
                break;
        }
    }

    static void task2(){
        int a = 0;
        while(a<26) {
            System.out.print(a + " ");
            a++;
        }
    }

    static void task3(){
        for(int i = 2; i <21; i++)
            if(i%2 == 0 && i >10)
                System.out.println(i);
    }

    static void task4(){
        System.out.print("Введите сумму денег: ");
        double amount = sc.nextInt();
        System.out.print("Введите количество месецев, на которое вы хотите положить деньги в банк: ");
        int mounth = sc.nextInt();

        for(int i = 0; i < mounth; i++ )
            amount += amount* 0.07;
        System.out.println("Сумма денег через " + mounth + "месецев сщставит " + amount);
    }

    static void task5(){

        while (true){
            System.out.print("Введите число a:");
            int a = sc.nextInt();

            System.out.print("Введите число b:");
            int b = sc.nextInt();

            System.out.println( a + "*" + b + "=" + (a*b));

            System.out.println("Желаете завершить программу?\n 1)Да \n 2)Нет");
            int question = sc.nextInt();
            if(question == 1)
            {
                System.out.println("Программа успешно завершена)");
                return;
            }
        }
    }

    static void task6() {

        System.out.print("Введите количество элементов массива: ");
        int number = sc.nextInt();
        int[] array = new int[number];
        System.out.print("Введите элементы массива: ");
        for (int i = 0; i < number; i++)
            array[i] = sc.nextInt();

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;


        for (int i = 0; i < number; i++) {
            if (array[i] > max2)
                if (array[i] > max1) {
                    max2 = max1;
                    max1 = array[i];
                }
                else max2 = array[i];
        }
            System.out.print("Первое максимальное число:" + max1 + "\nВтороее максимальное число: " + max2);

    }

    static void task7(){
        System.out.println("Вывести поле");
        System.out.println("Введите длину: ");
        int a = sc.nextInt();

        System.out.println("Введите ширину: ");
        int b = sc.nextInt();

        for(int j = 0; j < b; j++) {
            for (int i = 0; i < a; i++)
                System.out.print("*");
            System.out.print("\n");
        }

        System.out.println("Вывести таблицу умножения");

        for(int i = 1; i < 11; i++)
        {
            for (int j = 1; j <11; j++)
                System.out.println(i + "*" + j + "=" + (i*j));
            System.out.print("\n");
        }
    }

    static void task8(){
        boolean t = true;
        System.out.print("Введите число: ");
        int num = sc.nextInt();
        for(int i = 2; i < sqrt(num); i++)
            if(num % i == 0) {
                t = false;
                break;
            }
        if(!t)
            System.out.println("Введенное число не является простым");
        else
            System.out.println("Введенное число простое");
    }

}