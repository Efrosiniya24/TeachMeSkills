package lesson10;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class task3 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int operation = 0;
        while (true) {
            System.out.println("\nВыберите задание:\n 1)\n 2)\n 3)\n 4)");
            try {
                operation = sc.nextInt();
            }catch(InputMismatchException e){
                System.out.println("error1");
                sc.next();
            }
            switch (operation) {
                case 1 -> {
                    task1();
                }
                case 2 -> {
                    task2();
                }
                case 3 -> {
                    task3();
                }
                case 4->{
                    task4();
                }
            }
        }
    }

    static void task1(){
        //        1. Найти количество слов в строке(слова разделены пробелами)
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку: ");
        sc.next();
        String line = sc.nextLine();

        String[] size = line.split(" ");
        System.out.print("Количество слов в строке: " + size.length);
    }

    static void task2(){
        //        2. Найти слово с минимальной длинной
        Scanner a = new Scanner(System.in);
        int minLine = 0;
        System.out.print("Введите строку: ");
        String line = a.nextLine();
        String[] size = line.split(" ");
        int min = size[0].length();
        for(int i = 1; i < size.length; i++)
            if(size[i].length() < min){
                min = size[i].length();
                minLine = i;
            }
        System.out.print("Слово с минимальной длиной: " + size[minLine]);
    }

    static void task3(){
       // 3. Найти в строке слова палиндромы и вывести их через запятую
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите строку: ");
        String line = sc.nextLine();

        String[] string  = line.split(" ");

        ArrayList<String> p = new ArrayList<>();

        for(int i = 0 ; i< string.length; i++) {
            StringBuilder s = new StringBuilder(string[i]);
            if ((string[i]).equals(String.valueOf(s.reverse())))
                p.add(string[i]);
        }
        if(p.size() == 0)
            System.out.println("Слов палиндромов нет");
        else
                System.out.println(p);
        }

        static void task4(){
//            You are given an array of strings words and a string chars.
//            A string is good if it can be formed by characters from chars (each character can only be used once).
//            Return the sum of lengths of all good strings in words.

            Scanner sc= new Scanner(System.in);

            System.out.print("Введите строку: ");
            String line = sc.nextLine();
            String[]words = line.split(" ");

            System.out.print("Введите массив символов: ");
            String chars = sc.nextLine();

            int totalLength = 0;

            for(int i = 0; i <words.length; i++) {
                String[] temp = chars.split("");
               ArrayList<String> temp1 = new ArrayList<>();
                for (int j = 0; j < temp.length; j++)
                    if (words[i].contains(temp[j]))
                        temp1.add(temp[j]);
                if(words[i].contains(String.valueOf(temp1)))
                    totalLength += words[i].length();
            }
            if(totalLength ==0)
                System.out.println("Таких слов нет");
            else System.out.println(totalLength);
            }

}
