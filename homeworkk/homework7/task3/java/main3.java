//        Задача *:
//        Самостоятельно изучить и показать пример работы интерфейса-маркера Cloneable.

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
public class main3 implements Cloneable {
    public static void main(String[] args) throws CloneNotSupportedException{
        Scanner sc = new Scanner(System.in);
        sc.useLocale( Locale.US );


        double time;
        String name;
        String author;

        System.out.print("___Продемонстрируем работу интерфейс-маркера Cloneable____\n\n" +
                "Введите название композиции: ");
        name = sc.nextLine();

        System.out.print("Введите имя автора: ");
        author = sc.nextLine();

        System.out.print("Введите продолжительность композиции: ");
        while(true) {
            try {
                time = sc.nextDouble();
                break;
            }catch(InputMismatchException e){
                System.out.print("Повторите ввод: ");
                sc.next();
            }
        }

        Music music1 = new Music(name, author,time);

        System.out.println("\nСоздадим второй объект, склонируя первый");

        Music music2 = (Music) music1.clone();

        System.out.println("\nВыведем данные для первого объекта\n" + music1.getName() + "\n" + music1.getAuthor() +"\n" + music1.getTime());
        System.out.println("\nВыведем данные для второго объекта\n" + music2.getName() + "\n" + music2.getAuthor() +"\n" + music2.getTime());

        System.out.println("\nПоменяем название композиции, чтобы убедиться, что мы создали не ссылку, а именно объект");

        System.out.print("\nВведите название композиции: ");
        String name1 = sc.next();
        music2.setName(name1);

        System.out.println("\n___Измененные данные для двух объектов___");

        System.out.println("Выведем данные для первого объекта\n" + music1.getName() + "\n" + music1.getAuthor() +"\n" + music1.getTime());
        System.out.println("\nВыведем данные для второго объекта\n" + music2.getName() + "\n" + music2.getAuthor() +"\n" + music2.getTime());

    }
}
