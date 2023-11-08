package homework18;
import java.io.*;

public class Serializatorr {
    public static void serialization (StringBuilder text, String nameFile){
        try(FileOutputStream fileOutputStream = new FileOutputStream(nameFile);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(text);
            System.out.println("Информация успешно добавлена в файл)");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static StringBuilder deserialization (StringBuilder text, String nameFile) throws FileNotFoundException {
        try (FileInputStream fileInputStream = new FileInputStream(nameFile);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            return (StringBuilder) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
