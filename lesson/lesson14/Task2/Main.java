package lesson14.Task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
//    Задача 2:
//    При помощи стримов из списка строк вывести только те, которые начинаются с буквы ‘A’.
public static void main(String[] args) {
    List<String> lines = Arrays.asList("Арбуз", "Дыня", "Абрикос", "Помидор", "Аэропорт", "Дом");
    lines = lines.stream()
            .filter(x-> (x.charAt(0) == 'А'))
            //.collect(Collectors.toList());
            .collect(Collectors.toList());
    System.out.println(lines);
    }
}
