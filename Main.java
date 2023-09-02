package org.example;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int question;
        while(true) {
            System.out.println("Выберите номер задания:\n 1)\n 2)\n 3)\n 4)\n 5)");
            question= sc.nextInt();
            switch(question){
                case 1 :
                    task1();
                    break;
                case 2 :
                    task2();
                    break;
                case 3 :
                    task3();
                    break;
                case 4 :
                    task4();
                    break;
                case 5 :
                    task5();
                    break;
            }

            System.out.println("Желаете продолжить программу?\n 1) Нет\n 2) Да");
            question = sc.nextInt();
            if(question == 1 ) break;
        }
    }


//        Задача 1:
//        Напишите программу, которая будет принимать на вход число из консоли и на выход
//        будет выводить сообщение четное число или нет. Для определения четности числа
//        используйте операцию получения остатка от деления (операция выглядит так: '% 2').
    static void task1(){
        System.out.print("___Определение четности числа___\nВведите число:");
        int number = sc.nextInt();
        if(number %2 == 0)
            System.out.println("Число четное");
        else
            System.out.println("Число нечетное");
    }
//    Задача 2:
//    Для введенного числа t (температура на улице) вывести: Если t>–5, то вывести «Warm».
//    Если –5>= t > –20, то вывести «Normal». Если –20>= t, то вывести «Cold».

    static void task2(){

        System.out.print("Введите температуру: ");
        int temperature = sc.nextInt();
        if(temperature > -20) {
            if(temperature >-5)
                System.out.println("Warm");
            else
                System.out.println("Normal");
        }
        else System.out.println("Cold");
    }
    //    Задача 3:
//    Составьте программу, выводящую на экран квадраты чисел от 10 до 20 включительно.
    static void task3(){
        System.out.println("___Квадраты числе от 10 до 20 включительно___");
        for(int i =10; i< 21; i++)
            System.out.println( i +"^2=" +(i*i));
    }

//    Задача 4:
//    Необходимо, чтоб программа выводила на экран вот такую последовательность:
//         7 14 21 28 35 42 49 56 63 70 77 84 91 98. В решении используйте цикл while.
    static void task4(){
        int i = 7;
        System.out.print("___Вывод последовательности 7 14 21 28 35 42 49 56 63 70 77 84 91 98___ ");
        while (i < 99) {
            System.out.println(i + " ");
            i+=7;
        }
    }

//    Задача *:
//    Напишите программу, где пользователь вводит любое целое положительное число. А
//    программа суммирует все числа от 1 до введенного пользователем числа. Для ввода
//    числа воспользуйтесь классом Scanner. Сделать проверку, чтобы пользователь не мог
//    ввести некорректные данные.
    static void task5(){
        System.out.println("Введите положительное число");
        int number = 0;
        int sum = 0;
        while(true) {
            number=  sc.nextInt();
            if (number < 1)
                System.out.print("Вы ввели некорректные данные. Повторите ввод:");
            else break;
        }

        for(int i =1; i<=number; i++)
            sum +=i;
        System.out.println("Сумма числе от 1 до " + number+ " = " +sum);

    }
}