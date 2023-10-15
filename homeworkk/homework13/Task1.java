package homework13;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ввод: ");
        char[] line1 = sc.nextLine().toCharArray();

        Set line2 = new HashSet();

        for(char arr:line1)
            if(Character.isDigit(arr))
                line2.add(arr);

        System.out.println(line2);
    }
}
