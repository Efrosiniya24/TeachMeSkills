package homowork29_SOLID.SRP;

import java.util.*;

public class Teacher {
    public void setMarks() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Выберите номер ученика:");
            int student = sc.nextInt();

            System.out.print("Добавьте отметку:");
            int mark = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println(e);
        }
        System.out.println("Отметка добавлена");
    }

    public void reviewStudents() {
        System.out.println("Ученики:");
        Students students = new Students();
        Map<String, List<Integer>> studentMap = students.getStudents();
        System.out.println();
        int i = 0;
        for (Map.Entry<String, List<Integer>> student : studentMap.entrySet()) {
            i++;
            System.out.println(i + ")" + student.getKey() + student.getValue());
        }
    }
}
