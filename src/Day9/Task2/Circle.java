package Day9.Task2;

public class Circle extends Figure {
    private final double r;

    @Override
    public double perimeter() {
        double perimeter = 2*Math.PI*r;
        return perimeter;
    }

    @Override
    public double area() {
        double area = (Math.PI*this.r*this.r);
        return area;
    }

    public Circle(String color, double r) {
        super(color);
        this.r = r;

    }
}
