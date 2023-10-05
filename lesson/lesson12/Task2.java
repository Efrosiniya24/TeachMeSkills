package lesson12;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
//        Задача 2:
//        Используя FileReader и FileWriter сначала записать в файл tms2.txt фразу на латыни
//“Cognosce te ipsum”, а затем считать ее и вывести в консоль первую букву.

        Scanner sc = new Scanner(System.in);
        try(FileWriter fileWriter = new FileWriter("tms2.txt")) {
            fileWriter.write("Cognosce te ipsum");
            fileWriter.flush();
        } catch (IOException e) {
            System.out.println("Строка записана в файл");
            throw new RuntimeException(e);
        }

        try(FileReader fileReader = new FileReader("tms2.txt")){
            System.out.println((char)fileReader.read() + " -- первый символ строки “Cognosce te ipsum”");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
