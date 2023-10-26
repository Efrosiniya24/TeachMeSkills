package lesson16;

import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = "Today my 17th lesson. I’m the best 1! Find me in inst: @teachmeskills";
        while(true){
            System.out.println("\nВыберите задание:\n 1)\n 2)\n 3)\n 4)\n 5)\n 6)\n");
            int operstion = sc.nextInt();
            switch(operstion){
                case 1 ->task1(line);
                case 2 ->task2(line);
                case 3 ->task3(line);
                case 4 ->task4();
                case 5 ->task5();
                case 6 ->task6();
            }
        }
    }
    public static void task1(String line){
//      1. Написать метод который сможет вернуть все цифры из строки:
//      “Today my 17th lesson. I’m the best 1! Find me in inst: @teachmeskills”.
        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher(line);
        while(matcher.find())
            System.out.println(matcher.group());
    }
    public static void task2(String line){
//      2. Написать метод который сможет заменить КАЖДУЮ букву на знак & в строке из 1 задания.
        Pattern pattern = Pattern.compile("[A-Za-z]");
        Matcher matcher = pattern.matcher(line);
        System.out.println(matcher.replaceAll("&"));
    }

    public static void  task3(String line){
//        3. Написать метод который сможет вернуть инсту в строке из 1 задания.
    Pattern pattern = Pattern.compile("@(\\w*)");
    Matcher matcher = pattern.matcher(line);
    matcher.find();
    System.out.println(matcher.group());
    }

    public static void task4(){
//        4. Написать метод который возвращает true если строка имеет вид “null”.
        String line1 = "null";
        String line2 = "qwe";
        Pattern pattern = Pattern.compile("null");
        Matcher matcher1 = pattern.matcher(line1);
        Matcher matcher2 = pattern.matcher(line2);
        System.out.println("With 'null' -" + matcher1.find());
        System.out.println("With 'qwe' - " + matcher2.find());
    }

    public static void task5(){
//        5. В строке “Hello \n world \n !!!” заменить \n на “” используя классы Pattern и Matcher.
        String line = "Hello \n world \n !!!";
        Pattern pattern = Pattern.compile("\n");
        Matcher matcher = pattern.matcher(line);
        System.out.println(matcher.replaceAll("\"\""));
    }
    public static void task6(){
//        6. В строке “Всем привет!! Меня зовут Билл Гейтс и я мечтаю учиться в TeachMeSkills!”
//        найти имя и фамилию человека и вывести на экран!
    String line = "Всем привет!! Меня зовут Билл Гейтс и я мечтаю учиться в TeachMeSkills!";
    Pattern pattern = Pattern.compile("[А-Я][а-я]+ [А-Я][а-я]+");
    Matcher matcher = pattern.matcher(line);
        while (matcher.find())
            System.out.print(matcher.group());
    }

}
