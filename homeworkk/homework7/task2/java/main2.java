public class main2 {
    public static void main(String[] args) {
//        Задача 2:
//        Написать иерархию классов Фигура, Треугольник, Прямоугольник, Круг. Реализовать
//        функцию подсчета площади для каждого типа фигуры и подсчет периметра(используя
//        абстрактный класс/методы). Создать массив из 5 разных фигур. Вывести на экран сумму
//        периметра всех фигур в массиве

        double sumP = 0;
        double sumS = 0;
        Figure[] figure = new Figure[5];
        figure[0] = new Circle(3);
        figure[1] = new Triangle(3,4,5);
        figure[2] = new Rectangle(3,7);
        figure[3] = new Triangle(6,7,8);
        figure[4] = new Rectangle(9,9);

        for(int i = 0; i <5; i++)
            sumP += figure[i].perimeter();
        System.out.println("_________________________________\nСумма периметров всех фигур равна: " + sumP+"\n");

        for(int i = 0; i <5; i++)
            sumS += figure[i].square();
        System.out.println("_________________________________\nСумма площадей всех фигур равна: " + sumS);

    }
}