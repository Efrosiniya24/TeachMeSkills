package homework14;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Locale;
import java.util.Scanner;

public class Task1 {
//    Задача 1:
//    Пользователь вводит в консоль дату своего рождения. Программа должна вернуть дату,
//    когда пользователю исполнится 100 лет. Использовать Date/Time API.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите дату своего рождения: ");

        while (true) {
            String line = sc.nextLine();

            try {
                LocalDate localDate = LocalDate.parse(line);
                System.out.println("Вам исполнится 100 лет " + localDate.plusYears(100));
                return;
            } catch (DateTimeParseException e) {
                System.out.print("Введите дату наподобие год-месяц-день: ");
            }
        }
    }
}
