package lesson15.Task2;

public class Task2 {
//    Задача 2:
//    Создать рекорд Person с полями. Создать объект рекорда Person.
    public static void main(String[] args) {
        Person person = new Person("Frosya", 18);
        System.out.println(person.age() + " " + person.name());
    }
}
