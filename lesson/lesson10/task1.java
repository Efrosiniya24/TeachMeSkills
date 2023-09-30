package lesson10;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
//        Задача 1:
//        1.1 Объединить 2 строки в одну 2-мя способами.
//        1.2 Проверить 2 строки на равенство с и без учета регистра.
//        1.3 Вернуть подстроку с 3-го символа до конца.
//        1.4 Вывести длину строки
//        1.5 Вывести порядковый номер любого символа в строке.
//        1.6 Преобразовать логический тип true к строке.
//        1.7 Перевести строку в верхний регистр.
//        1.8 Заменить ‘1’ в строке на ‘%’.
//        1.9 Убрать все пробелы в строке с двух сторон.
//        1.10 Проверить, пустая ли строка.
//        1.11 Разбить строку на несколько по делителю

        String s1 = "123";
        String s2 = "456";
        System.out.println("Объединение строк, используя concat " + s1.concat(s2));
        System.out.println("Объединение строк, используя join " + String.join(" ",s1,s2));
        System.out.println("_________1___________");


        String q1 = "Hello world";
        String q2 = "HELLO World";
        System.out.println("Равенство строк без участия регистра: " + q1.equals(q2));
        System.out.println("Равенство строк с участия регистра: " + q1.equalsIgnoreCase(q2));
        System.out.println("___________2_________");

        System.out.println("Вернем подстроку строки 'Hello world' с 3 символа с конца:" + q1.substring(q1.length()-3));
        System.out.println("__________3__________");

        System.out.println("Длина строки 'Hello world':" + q1.length());
        System.out.println("__________4__________");

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите любой символ строки 'Hello world': ");
        String print = sc.nextLine();
        System.out.println("Данный символ занимает: " + (q1.indexOf(print)+ 1) +" позицию");
        System.out.println("___________5_________");

        System.out.println("Преобразуем true к строке : " + true);
        System.out.println("___________6_________");

        System.out.println("Перееведем строку 'Hello world' в верхний регистр: "+ q1.toUpperCase());
        System.out.println("__________7__________");

        String w = "1а1п3п111п5";
        System.out.println("Заменить ‘1’ в строке '1а1п3п111п5' на ‘%’: " + w.replace('1', '%'));
        System.out.println("__________8__________");

        String e = "   Hello world    ";
        System.out.println("Уберем все пробелы в строке '   Hello world    'с двух сторон: " + e.trim());
        System.out.println("__________9__________");

        System.out.println("Проверим, пустая ли строка 'Hello world': " + (q1 != null && q1.isEmpty()));
        System.out.println("__________10__________");

        String t = "Hello my world!";
        System.out.println("Разобъем строку 'Hello my world!' на несколько делителей и выведем их построчно" );
        String[] tI = t.split(" ");
        for(int i = 0; i < tI.length; i++)
            System.out.println(tI[i]);
        System.out.println("__________11__________");

    }
}