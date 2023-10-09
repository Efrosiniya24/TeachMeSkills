package lesson13;

import java.util.HashSet;

public class Task3 {
    public static void main(String[] args) {
//        Задача 3:
//        3.1 Создать класс Person.
//        3.2 Создать HashSet в классе Main.
//        3.3 Добавить к этому списку 3 объекта Person, вывести результат используя for each.
//        3.4 Удалить 2 объекта из коллекции.
//        3.5 Проверить, содержится ли оставшийся объект в коллекции

        HashSet<Person> people = new HashSet<>();

        Person person1 = new Person("Katya", 18);
        Person person2 = new Person ("Lena", 21);
        Person person3 = new Person("Olya", 19);

        people.add(person1);
        people.add(person2);
        people.add(person3);

        people.forEach(System.out::println);

        people.remove(person1);
        people.remove(person2);

        System.out.println();
        people.forEach(person -> System.out.println(person));


    }
}
