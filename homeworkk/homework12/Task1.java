package homework12;

import java.io.FileReader;
import java.io.IOException;

public class Task1 {
//    Задача 1:
//    В задании приложен файл Ромео и Джульетта на английском, вычитать его в приложении.
//    Проанализировать и записать в другой файл самое длинное слово
    public static void main(String[] args) throws IOException {
        String text;
        int max = 0;
        String search = null;

        try (FileReader fileReader = new FileReader("romeo")) {
            StringBuilder stringBuilder = new StringBuilder();
            int i;
            while ((i = fileReader.read()) != -1)
                stringBuilder.append((char) i);
            text = stringBuilder.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

       String[] words =  text.split("\\s|=|\n");

       for(String t:words)
            if(t.length() > max){
                max= t.length();
                search = t;
            }
       Serializator.serialization("Самое длинное слово в файле: " + search);
       System.out.println(Serializator.deserialization());
    }
}
