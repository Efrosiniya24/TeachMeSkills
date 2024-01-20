package homework35;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class task1 {
//    Задача 1:
//    На вход поступает массив строк, верните Map<String, Boolean>, где каждая отдельная
//    строка является ключом, и ее значение равно true, если эта строка встречается в массиве
//    2 или более раз. Пример:
//    wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
//    wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}
//    wordMultiple(["c", "c", "c", "c"]) → {"c": true}

    public static void main(String args[]){
        String[] line1 = {"a", "b", "a", "c", "b"};
//        String[] line1 = {"c", "b", "a"};
//        String[] line1 = {"c", "c", "c", "c"};

        List<String> line = List.of(line1);
        Map<String, Boolean> newlines1 = new HashMap<>();
        for(String linee: line1)
            newlines1.put(linee, Collections.frequency(line, linee) >1);
        System.out.println(newlines1);
    }
}
