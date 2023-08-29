package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //task1
        System.out.println("\nЗадание 1");
        int b = 1;
        int c = 2;
        double a = 4 * (b + c - 1) / 2;
        System.out.println("a = 4 * (b + c - 1) / 2 =  " + a);

        //task2
        System.out.println("\nЗадание 2");
        int n = 26;
        System.out.println("Сумма цифр числа 26 равна " + (n/10+n%10));

        //task3
        System.out.println("\nЗадание 3");
        int m = 126;
        System.out.println("Сумма цифр числа 126  равна " + (m/100+(m%100/10) +(m%100%10)));

        //task4
        System.out.println("\nЗадание 4");
        double u = 2.234;
        System.out.println("Число 2.234 округляется до" + ((int)(u+0.5)));

        //task5
        System.out.println("\nЗадание 5");
        int q = 21;
        int w = 8;
        System.out.println(q + " / " + w + " = " + (q/w) +" и " + (q%w) + " в остатке");

        //task*
        System.out.println("\nЗадание *");
        int a1 = 1;
        int a2 = 2;
        int t = 0;

        t = a1;
        a1 = a2;
        a2 = t;
        System.out.println(  a1 + " " + a2);

          //или без использования третей переменной
//        a1+=a2;
//        a2=a1-a2;
//        a1-=a2

        //taskCalculator
        System.out.println("\nКалькулятор");
        System.out.println("a = ");
        int number1 = sc.nextInt();

        System.out.println("b = ");
        int number2 = sc.nextInt();

        System.out.println("Выберите операцию:\n1)+\n2)-\n3)/\n4)%\n");
        int operation = sc.nextInt();
        if(operation == 1 )
        System.out.println(number1 +" + " + number2 + " = " + (number1+number2));
        else  if(operation == 2)
        System.out.println(number1 +" - " + number2 + " = " + (number1-number2));
        else  if(operation == 3)
        System.out.println(number1 +" / " + number2 + " = " + (number1/number2));
        else  if(operation == 4)
        System.out.println(number1 +" % " + number2 + " = " + (number1%number2));

    }
}