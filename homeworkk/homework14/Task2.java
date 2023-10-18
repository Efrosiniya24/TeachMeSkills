package homework14;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
//        Задача 2:
//        Используя Predicate среди массива чисел вывести только те, которые являются
//        положительными.
        List<Integer>numbers = Arrays.asList(5,8,-3,-22,65,-32);
        Predicate<Integer> isNumber = x -> x >0;
        numbers.stream()
                .filter(isNumber)
                .forEach(x->System.out.print(x+" "));
    }
}
