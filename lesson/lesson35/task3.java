package lesson35;

import java.util.*;

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String line = sc.nextLine();
        List<String> lines = List.of(line.split(" "));
        Map<String, Integer> words = new HashMap<>();
        for(String word: lines)
            words.put(word, words.getOrDefault(word, 0) +1);
        System.out.println(words);

        TreeMap<String, Integer> newWords = new TreeMap<>((e1,e2) -> Objects.equals(words.get(e1), words.get(e2)) ? e1.compareTo(e2) : words.get(e2) - words.get(e1));
        newWords.putAll(words);
        System.out.println(newWords);

        words.clear();
        words.putAll(newWords);
        System.out.println("Введите число повторений: ");
        int k = sc.nextInt();
        for(int i = 0; i< k; i++){
            System.out.println(words.getOrDefault(words, i));
        }

//        List.of(words.keySet()).sort(Comparator.comparing(words.values()));
        //System.out.println(words.entrySet().stream().sorted(words.values()));



    }
}