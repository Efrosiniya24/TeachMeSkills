package Task3;

import java.util.*;

public class Student {
    private String name;
    private int groop;
    private int course;
    private double average;

    public Student(String name, int groop, int course, double average) {
        this.name = name;
        this.groop = groop;
        this.course = course;
        this.average = average;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroop() {
        return groop;
    }

    public void setGroop(int groop) {
        this.groop = groop;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public static void printStudents(List<Student> students, int course){
        int size = students.size();
       System.out.println("Студенты, обучающиеся на " + course+ " : ");
       for(int i =0; i< size; i++)
           if(students.get(i).getCourse() == course)
               System.out.println(students.get(i).getName());
   }

}
