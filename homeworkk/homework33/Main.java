package homework33;

public class Main {
    //    Задача 1:
//    Создать класс для описания пользователя системы. Переопределить в классе методы
//    toString,hashcode и equals. Создать несколько экземпляров класса с одним и тем же
//    значением полей и сравнить с помощью метода equals.

//    Задача *:
//    Создать программу для реализации поверхностного и глубокого клонирования объекта
//    класса User. Пусть на вход программе будет передаваться тип операции клонирования
//            (поверхностное клонирование или глубокое), а также id юзера для клонирования
    public static void main(String[] args) throws CloneNotSupportedException {
        User user1 = new User("Anna", 34,1 );
        User user2 = new User("Anna", 34, 1);
        User user3 = new User("Anna", 34, 1);
        User user4 = new User("Anna", 34, 1);
        User user5 = new User("Anna", 34, 1);

        System.out.println("user1 and user2 " + user1.equals(user2));
        System.out.println("user2 and user3 " + user2.equals(user3));
        System.out.println("user3 and user4 " + user3.equals(user4));
        System.out.println("user4 and user5 " + user4.equals(user5));

        System.out.println("user1 до клонирования"+ user1);
        User user10 = user1.surfaceCloning();
        System.out.println("user1 при поверхностном клонировании: " +user10);
        User user11 = user1.deepCloning();
        System.out.println("user1 при глубоком клонировании: " +user11);
    }
}
