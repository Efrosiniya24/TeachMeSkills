package lesson13;

public class Task4 {
    public static void main(String[] args) {
//        Задача 4:
//        Создать дженерик класс Storage с полем того типа который передаем в дженерик при
//        создании объекта. Сделать конструктор по дефолту и конструктор с этим полем.
//                Добавить геттеры/сеттеры. В методе main создать 2 объекта на основе этого дженерика и
//        проверить их работу.

        Storage<Integer> num1 = new Storage<>();
        Storage<Integer> num2 = new Storage<>(865);

        Storage<String> num3  = new Storage<>();
        Storage<String> num4  = new Storage<>("wtfdyjgjfdq");

        num1.setNum(235);
        System.out.println("Поле первого объекта: " + num1.getNum());
        System.out.println("Поле второго объекта: " + num2.getNum());

        num3.setNum("AREG");
        System.out.println("Поле третьего объекта: " + num3.getNum());
        System.out.println("Поле четвертого объекта: " + num4.getNum());
    }
}
