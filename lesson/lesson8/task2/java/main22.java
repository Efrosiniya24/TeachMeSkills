public class main22 {
    public static void main(String[] args) {
//        Задача 2:
//        Создать класс Person с полями name, age, gender. Поле name сделать public, age
//        оставить по дефолту, gender – private. В классе Main создать объект Person.
//        Предположить какие поля мы увидим. Продемонстрировать значения полей объекта
//        используя геттеры и поля если это возможно

        Person person = new Person("Frosya", 18,"woman");
        System.out.println("Name: " + person.name);
        System.out.println("Age: " + person.age);
        System.out.println("Gender: " + person.getGender());
    }
}
