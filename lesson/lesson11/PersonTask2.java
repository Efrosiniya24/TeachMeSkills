package lesson11;

public class PersonTask2 {
    private int age;

    public PersonTask2(int age) {
        this.age = age;
    }
    public int myage(int age) throws PersonTask2Exeption{
        if(age <18)
            throw new PersonTask2Exeption();
        return age;
    }
}
