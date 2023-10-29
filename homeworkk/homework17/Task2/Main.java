package homework17.Task2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
//    Задача *:
//    Программа на вход получает произвольный текст. В этом тексте может быть номер
//    документа(один или несколько), емейл и номер телефона. Номер документа в формате:
//    xxxx-xxxx-xx, где x - это любая цифра; номер телефона в формате: +(xx)xxxxxxx. Документ
//    может содержать не всю информацию, т.е. например, может не содержать номер
//    телефона, или другое. Необходимо найти эту информацию и вывести в консоль в
//    формате:
//    email: teachmeskills@gmail.com
//    document number: 1423-1512-51
//    и т.д

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите текст: ");
        String line = sc.nextLine();

        String[] descriptions ={"document number", "phone number", "email"};

        Pattern documentPattern = Pattern.compile("\\b\\d{4}-\\d{4}-\\d{2}\\b");
        Pattern phonePatten = Pattern.compile("\\b\\+\\(\\d{2}\\)\\d{7}\\b");
        Pattern emailPattern = Pattern.compile("\\b\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}\\b");

        Matcher[] matcher ={documentPattern.matcher(line),phonePatten.matcher(line), emailPattern.matcher(line)};

       for(int i = 0; i<3; i++)
           while (matcher[i].find())
               System.out.println(descriptions[i] +": "+ matcher[i].group());
    }
}
