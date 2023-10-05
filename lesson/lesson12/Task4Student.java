package lesson12;

public class Task4Student {
    private int group;
    private String surname;
    private int age;

    public Task4Student(int group, String surname, int age) {
        this.group = group;
        this.surname = surname;
        this.age = age;
    }


    public int getGroup() {
        return group;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Task4Student{" +
                "group=" + group +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
