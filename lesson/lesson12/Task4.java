package lesson12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Task4 {
    public static void main(String[] args) {
//        Создать класс студент с полями группа, фамилия, возраст
//        Создать массив из не менее чем 6 разных студентов, отсортировать его.
//        Порядок сортировки должен быть таким- группа>возраст>фамилия
//
        ArrayList<Task4Student> students = new ArrayList<>(Arrays.asList(new Task4Student(214301, "Zinkouskaya", 18),
        new Task4Student(210902, "Bilida", 18),
        new Task4Student(214301, "Bulatevich", 18),
        new Task4Student(214302, "Kosovich", 19),
        new Task4Student(214302, "Vasilkov", 18),
        new Task4Student(101010, "Kormilzeva", 21),
        new Task4Student(124301, "Kovaleva", 19)));

        Comparator<Task4Student>  byGroup = Comparator.comparing(Task4Student::getGroup);

        Comparator<Task4Student>  byAge = Comparator.comparing(Task4Student::getAge);

        Comparator<Task4Student>  byaSurname = Comparator.comparing(Task4Student::getSurname);

        Collections.sort(students, byAge.thenComparing(byGroup).thenComparing(byaSurname));

        for(Task4Student s:students)
            System.out.println(s);

    }
}
