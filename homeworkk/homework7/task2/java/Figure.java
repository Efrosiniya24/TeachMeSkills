public abstract class Figure {
    private double r = 0;
    private  double a = 0;
    private  double b = 0;
    private  double c = 0;
    public abstract double perimeter();
    public abstract double square();

    public Figure(double r) {
        this.r = r;
    }

    public Figure(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Figure(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getR() {
        return r;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
}
