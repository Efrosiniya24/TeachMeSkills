package lesson14.Task1;

import java.util.Optional;

public class Main {
//    Задача 1:
//    Создать класс User с полем name. В Main создать поле user типа User. Заранее мы не
//    знаем лежит там объект или отсутствует. Написать логику, которая будет выводить имя
//    пользователя если объект присутствует в user, либо ‘DEFAULT’ в противном случае.
//    Использовать класс Optional.

    public static void main(String[] args) {
        Optional<User> user = Optional.of(new User("cat"));

        String nullNAme = "DEFAULT";
        String  name = user.map(User::getName).orElseGet(()->nullNAme);
        System.out.println(name);
    }
}
