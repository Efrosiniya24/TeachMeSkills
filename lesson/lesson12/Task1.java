package lesson12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
//    Задача 1:
//    Используя FileOutputStream и FileInputStream записать в файл tms.txt строку, введенную
//    пользователем с консоли. Считать строку из файла tms.txt и вывести в консоль, заменив
//    все пробелы на знак нижнего подчеркивания.
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String line = sc.nextLine();
        try(FileOutputStream fileOutputStream = new FileOutputStream("tms.txt")){
            fileOutputStream.write(line.getBytes());
        }catch (IOException e){
            System.err.println(e.getMessage());
        }

        try(FileInputStream inputStream = new FileInputStream("tms.txt")){
            int i;
            while((i = inputStream.read()) != -1) {
                if((char) i == ' ')
                    i = '_';
               System.out.print((char) i);
           }
        }catch (IOException e){
            System.err.println(e.getMessage());
        }

    }
}
