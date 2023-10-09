package lesson13;

import java.util.Arrays;
import java.util.LinkedList;

public class Task2 {
    public static void main(String[] args) {
//        Задача 2:
//        2.1 Создать двусвязный список стран мира.
//        2.2 Добавить к этому списку 4 страны ( 2 в начало и 2 в конец), вывести результат в
//        консоль (Использовать методы addFirst/addLast).
//        2.3 Удалить по одному элементу из начала и из конца списка.
//        2.4 Получить по одному элементу из начала и из конца списка

        LinkedList<String> countries = new LinkedList<>();

        countries.addLast("Russia");
        countries.addLast("Ukraine");
        countries.addFirst("Swizerland");
        countries.addFirst("Spain");

        System.out.println(countries);

        countries.removeFirst();
        countries.removeLast();

        System.out.println(countries);

        System.out.println("Страна из начала списка: " + countries.getFirst());

        System.out.println("Страна из конца списка: " + countries.getLast());
    }
}
