package lesson12;

import java.io.*;

public class Serializator {
    public static void serialization (Student student){
        try(FileOutputStream fileOutputStream = new FileOutputStream("Student");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(student);
            System.out.println("Информация успешно добавлена в файл)");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Student deserialization (Student student) throws FileNotFoundException {
        try (FileInputStream fileInputStream = new FileInputStream("Student");
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            return (Student) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
