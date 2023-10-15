package Task2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Animals {
    private static LinkedList<String>  animals = new LinkedList<>(Arrays.asList(
            "tiger", "bear", "dolphin", "elephant", "cat"));
    public static void add(String name){
        animals.addFirst(name);
    }

    public static void delete(){
        animals.removeLast();
        System.out.println("Удаление произведено успешно)");
    }

    public static void review(){
        System.out.println("Животные: ");
        int size = animals.size();
        for(int i = 0; i<size; i++)
            System.out.println((i+1)+") " + animals.get(i));
    }
}
