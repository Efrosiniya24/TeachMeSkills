public class Triangle extends Figure {
    private final double r = 0;
    private double a;
    private double b;
    private double c;
    @Override
    public double perimeter(){
        System.out.println("Периметр треугольника равен " +(a+b+c));
        return a+b+c;
    }
    @Override
    public double square() {
        double p = (a+b+c)/2;
        System.out.println("Площадь треугольника равна " + Math.sqrt(p*(p-a)*(p-b)*(p-c)));
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    public Triangle(double r, double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
