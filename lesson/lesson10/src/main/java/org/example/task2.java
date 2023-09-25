package org.example;

public class task2 {
    public static void main(String[] args) {
//        Задача 2:
//        2.1 Создать объект StringBuilder c любой строкой.
//        2.2 Добавить к строке “xxxx”.
//        2.3 В 5-ю позицию вставить “y”.
//        2.4 Удалить символы с 3 по 6.
//        2.5 Перевернуть строку.
//        2.6 Преобразовать в String и вывести в консоль.

        StringBuilder string = new StringBuilder("Hello world");
        System.out.println("Исходная строка: "+ string);
        System.out.println("Добавим к строке 'xxxx': " + string.append("xxxx"));
        string.setCharAt(5,'y');
        System.out.println("В 5-ю позицию вставим 'y': " + string);
        System.out.println("Удалим  символы с 3 по 6: " + string.delete(3,6));
        System.out.println("Перевернем строку: " + string.reverse());
        System.out.println("Преобразуем в String: " + String.valueOf(string));
    }
}
