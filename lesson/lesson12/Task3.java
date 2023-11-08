package lesson12;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Task3 {
    public static void main(String[] args) throws FileNotFoundException {
//        Задача 3:
//        Cоздать объект класса Student, сериализовать и десериализовать его
        Student student = new Student(18, "Frosya");

        Serializator.serialization(student);

       Serializator.deserialization(student);

        System.out.println(student);
    }
}
