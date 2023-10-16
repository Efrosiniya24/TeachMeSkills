package lesson14.Task3;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Задача 3:
//        При помощи стримов из списка, содержащего объекты Developer, вывести только те, id >
//        10 и name начинается с ‘An’.
        List<Developer> developers = Arrays.asList(new Developer(74, "Anieu"),
                new Developer(53, "hdhd"),
                new Developer(2,"Andu"),
                new Developer(83,"Anna"),
                new Developer(73,"jsj"));

        developers.stream()
                .filter(x ->(x.getId() > 10 && x.getName().startsWith("An")))
                .forEach(System.out::println);
    }
}
