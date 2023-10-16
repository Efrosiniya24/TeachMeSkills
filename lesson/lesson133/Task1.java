package lesson133;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class Task1 {
//    Задача 1:
//    Написать программу для вывода на консоль названия дня недели по введенной дате
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите дату:");
        String data = sc.next();
        DayOfWeek day = LocalDate.parse(data).getDayOfWeek();
        System.out.println(day);
    }
}
