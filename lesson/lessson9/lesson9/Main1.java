import java.awt.*;

public class Main1 {
    public static void main(String[] args) {
//        Задача 1:
//        Реализовать иерархию, показанную ниже, переопределить методы draw и erase в каждом
//        из классов так, чтобы он выводил “I draw ”+ имя класса и “I erase ” + имя класса. Показать
//        работу каждого из методов в main другого класса.

        Shape triangle = new Triangle1();
        Shape circle = new Circle11();
        Shape square = new Square();

        triangle.draw();
        triangle.erase();
        square.draw();
        square.erase();
        circle.draw();
        circle.erase();
    }
}
