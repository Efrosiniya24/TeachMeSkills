package lesson13;

import java.util.ArrayList;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
//        Задача 1:
//        1.1 Создать коллекцию ArrayList стран мира.
//        1.2 Добавить к этому cписку 3 страны, вывести результат в консоль.
//        1.3 Заменить 2-й элемент.
//        1.4 Удалить его по индексу.
//        1.5 Удалить любой элемент по значению.
//        1.6 Узнать индекс любого элемента.
//        1.7 Проверить, содержится ли элемент в коллекции (любой)

        ArrayList<String> countries = new ArrayList<>(Arrays.asList(
                "Belarus",
                "Italy",
                "Germany"));
        System.out.println(countries);

        countries.add("Ukraine");
        System.out.println(countries);

        countries.set(1, "Spain");
        System.out.println(countries);

        countries.remove(1);
        System.out.println(countries);

        countries.remove("Germany");
        System.out.println(countries);

        System.out.println("Ukraine аходится в списке под индексом " +  countries.indexOf("Ukraine"));

        if(countries.contains("Belarus"))
            System.out.println("Belarus содержится в списке");

        if(!countries.contains("Russia"))
            System.out.println("Russia не содержится в списке");
    }
}
