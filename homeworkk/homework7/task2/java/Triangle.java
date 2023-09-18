public class Triangle extends Figure {

    public Triangle(double a, double b, double c) {
        super(a, b, c);
    }

    @Override
    public double perimeter(){
        System.out.println("Периметр треугольника равен " +(this.getA()+this.getB()+this.getC()));
        return this.getA()+this.getB()+this.getC();
    }
    @Override
    public double square() {
        double p = (this.getA()+this.getB()+this.getC())/2;
        System.out.println("Площадь треугольника равна " + Math.sqrt(p*(p-this.getA())*(p-this.getB())*(p-this.getC())));
        return Math.sqrt(p*(p-this.getA())*(p-this.getB())*(p-this.getC()));
    }


}
