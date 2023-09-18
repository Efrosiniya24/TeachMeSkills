public class Circle extends Figure {
    private final double PI = 3.14;

    public Circle(double r) {
        super(r);
    }

    @Override
    public double perimeter(){
        System.out.println("Периметр круга равен " +(2*PI*this.getR()));
        return 2*PI*this.getR();
    }
    @Override
    public double square() {
        System.out.println("Площадь круга равна " +(2*this.getR()*this.getR()));
        return 2*this.getR()*this.getR();
    }

}
