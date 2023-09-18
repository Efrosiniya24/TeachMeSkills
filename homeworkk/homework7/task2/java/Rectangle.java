public class Rectangle extends Figure {
    public Rectangle(double a, double b) {
        super(a, b);
    }

    @Override
    public double perimeter(){
        System.out.println("Периметр прямоугольника равен " +(2*(this.getA()+this.getB())));
        return 2*(this.getA()+this.getB());
    }

    @Override
    public double square() {
        System.out.println("Площадь прямоульника равна " +(this.getA()*this.getB()));
        return this.getA()*this.getB();
    }


}
