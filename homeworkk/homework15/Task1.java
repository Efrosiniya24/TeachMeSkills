package homework15;

import java.util.Arrays;
import java.util.List;

public class Task1 {
//    Задача 1:
//    Создать коллекцию класса ArrayList наполнить ее элементами типа Integer. С помощью
//    Stream'ов:
//- Удалить дубликаты
//- Оставить только четные элементы
//- Вывести сумму оставшихся элементов в стриме
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3,8,2,6,2,5,83,5);
        int sum = numbers.stream()
                .distinct()
                .filter(x->x%2==0)
                .reduce((x1,x2)->x1+x2).orElse(0);
        System.out.println("Сумма оставшихся элементов списка " + numbers +" равна " + sum);
    }
}
