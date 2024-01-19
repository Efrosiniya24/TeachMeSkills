package lesson35;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    //    Задача 1:
//1.1 Создать список: номер карты и количество денег на карте, используя HashMap.
//1.2 Добавить к этому списку 3 записи.
//1.3 Удалить 2 записи.
//1.4 Вывести запись по ключу.
//1.5 Вывести список всех ключей.
// 1.6 Вывести список всех сумм на картах.
// 1.7 Проверить, содержится ли любой элемент в коллекции
    public static void main(String[] args) {
        Map<Integer,Double> card = new HashMap<>();
        card.put(25366, 235.6);
        card.put(63462,4365.);
        card.put(52353,342.);

        System.out.println(card);

        card.put(7358,732.);
        card.put(25253,47.);
        card.put(34672,834.);

        System.out.println(card);

        card.remove(25366);
        card.remove(7358);

        System.out.println("Удаление карт с номерами 25366 и 7358: "+ card);

        System.out.println("Просмотр карты с номером 52353 " + card.get(52353));

        System.out.println("Список всех ключей: " + card.keySet());

        System.out.println("Список всех сумм на карте: " + card.values());

        System.out.println("СОдержится ли сумма 47. в коллекции: " + card.containsValue(47.));
    }
}
