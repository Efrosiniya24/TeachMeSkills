package homework15;

import java.util.*;
import java.util.stream.Collectors;

public class Task2 {
//    Создать набор данных в формате id-name, сохраненный в Map. Необходимо отобрать из
//    этого набора только те данные, id которых попадает в числовой диапазон 1/2/5/8/9/13.
//    Среди отобранных значений отобрать только те, которые имеют нечетное количество
//    букв в имени. После чего вернуть список List имен, записанных буквами задом наперед.
    public static void main(String[] args) {
        Map<Integer, String> id = Map.of(4, "Anna",
                9, "Nikita",
                23, "Ivan",
                11, "Pavel",
                81, "Liza",
                7, "Nazar",
                0, "Masha",
                1, "Tanya",
                2, "Katya",
                8, "Aleksey");

        List<String> newId = id.entrySet().stream()
                .filter(x -> List.of(1, 2, 5, 8, 9, 13).contains(x.getKey()))
                .filter(x -> x.getValue().length() % 2 != 0)
                .map(x -> new StringBuilder(x.getValue()).reverse().toString())
                .collect(Collectors.toList());
        System.out.println(newId);
    }
}
