package homowork29_SOLID.SRP;

import java.util.Scanner;

public class School {
    public static void setMaterial(){
        System.out.println("Добавте материал: ");
        Scanner sc = new Scanner(System.in);
        String material = sc.next();
        System.out.println("Материал добавлен!");
    }
}
