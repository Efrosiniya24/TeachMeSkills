public class Rectangle extends Figure {
    private final double r = 0;
    private double a;
    private double b;
    private double c;
    @Override
    public double perimeter(){
        System.out.println("Периметр прямоугольника равен " +(2*(a+b)));
        return 2*(a+b);
    }
    @Override
    public double square() {
        System.out.println("Площадь прямоульника равна " +(a*b));
        return a*b;
    }

    public Rectangle(double r, double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
