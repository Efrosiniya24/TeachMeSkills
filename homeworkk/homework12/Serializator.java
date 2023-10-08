package homework12;

import lesson12.Student;

import java.io.*;

public class Serializator {
    public static void serialization (String word){
        try(FileOutputStream fileOutputStream = new FileOutputStream("answer");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(word);
            System.out.println("Информация успешно добавлена в файл)");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static String deserialization () throws FileNotFoundException {
        try (FileInputStream fileInputStream = new FileInputStream("answer");
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            return (String) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException  e) {
            throw new RuntimeException(e);
        }
    }
}
