public class Circle extends Figure {
    private final double PI = 3.14;
    private double r;
    private final double a = 0;
    private final double b = 0;
    private final double c = 0;
    @Override
    public double perimeter(){
        System.out.println("Периметр круга равен " +(2*PI*r));
        return 2*PI*r;
    }
    @Override
    public double square() {
        System.out.println("Площадь круга равна " +(2*r*r));
        return 2*r*r;
    }

    public Circle(double r, double a, double b, double c) {
        this.r = r;
    }
}
