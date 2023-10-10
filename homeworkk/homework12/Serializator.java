package homework12;

import lesson12.Student;

import java.io.*;

public class Serializator {
    public static void serialization (String word, String name){
        try(FileOutputStream fileOutputStream = new FileOutputStream(name);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(word);
            System.out.println("Информация успешно добавлена в файл)");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static String deserialization (String name) throws FileNotFoundException {
        try (FileInputStream fileInputStream = new FileInputStream(name);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            return (String) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException  e) {
            throw new RuntimeException(e);
        }
    }
}
