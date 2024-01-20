package homework35;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class task2 {
    public static void main(String[] args) {
//        Задача 2:
//        На вход поступает массив непустых строк, создайте и верните Map<String,
//                String> следующим образом: для каждой строки добавьте ее первый символ в
//        качестве ключа с последним символом в качестве значения. Пример:
//        pairs(["code", "bug"]) → {"b": "g", "c": "e"}
//        pairs(["man", "moon", "main"]) → {"m": "n"}
//        pairs(["man", "moon", "good", "night"]) → {"g": "d", "m": "n", "n": "t"}

        String[] line1 = {"code", "bug"};
//        String[] line1 = {"man", "moon", "main"};
//        String[] line1 = {"man", "moon", "good", "night"};

        Map<String, String> newLine = new HashMap<>();
        for(String linee: line1)
            newLine.put(String.valueOf(linee.charAt(0)), String.valueOf(linee.charAt(linee.length()-1)));
        System.out.println(newLine);
    }
}
