package homework13.Task3;

import java.util.*;

public class Main {
    private static HashMap<Student, Object> hashMapVar;
    static ArrayList<Student> students = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int operation = 0;
            System.out.println("Меню:\n 1)Добавить студентов\n 2)Изменить курс студентов/удалить студентов\n 3) Просмотреть список студентов\n 4) Выход");

            while (true) {
                try {
                    operation = sc.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Введите целое число");
                    sc.next();
                }
            }

            switch (operation) {
                case 1 -> add();
                case 2 -> delete();
                case 3 -> {
                    System.out.println("Введите курс: ");
                    int course = sc.nextInt();
                    Student.printStudents(students, course);
                }
                case 4 ->{return;}
            }
        }
    }


    public static void add() {
        Student student;
        Scanner sc = new Scanner(System.in);
        String name;
        int group;
        int course;
        int operation;
        Map<String, Integer> subject = new HashMap<>();
        String subjectt;
        int mark;

        while (true) {
            System.out.print("Имя: ");
            name = sc.next();

            System.out.print("Группа: ");
            group = choice();

            System.out.print("Курс: ");
            while (true) {
                course = choice();
                if (course < 6 && course > 0)
                    break;
            }

            System.out.println("Введите отметки по четырем дисциплинам");
            double average = 0;
            for (int i = 0; i < 4; i++) {
                System.out.print("Дисциплина: ");
                subjectt = sc.next();

                while (true) {
                    mark = choice();
                    if (mark > -1 && mark < 11){
                        average += mark;
                        break;
                    }
                }
                average/=4;
            }
            student = new Student(name, group, course, average);
            students.add(student);

            System.out.println("Продолжить?\n 1) Да\n 2)Нет");
            operation = choice();
            if(operation ==2)
                return;
        }
    }

    public static void delete(){
        for(int i = 0; i<students.size(); i++){
            if(students.get(i).getAverage() < 3)
                students.remove(students.get(i));
            else
                students.get(i).setCourse((students.get(i).getCourse() +1));
        }
        System.out.println("Операция произведена успешно!)");
    }

    public static int choice(){
        Scanner sc= new Scanner(System.in);
        int operation;
        while(true){
            System.out.println("Продолжить?\n 1) Да\n 2)Нет");
            try{
                operation = sc.nextInt();
                break;
            }catch (InputMismatchException e){
                System.out.println("Введите целое число");
                sc.next();
            }
        }
        return operation;
    }
}
