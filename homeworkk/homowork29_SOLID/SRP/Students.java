package homowork29_SOLID.SRP;

import java.util.*;

public class Students {
    private static Map<String, List<Integer>> students = new HashMap<>();

    public static Map<String, List<Integer>> getStudents() {
        return students;
    }

    public Students() {
        students.put("Катя", Arrays.asList(4, 6));
        students.put("Маша", Arrays.asList(8, 5));
        students.put("Даша", Arrays.asList(9, 10));
    }

    @Override
    public String toString() {
        return "Students{}";
    }
}
