package Day9.Task2;

public class Rectangle extends Figure {
    private final double a;
    private final double b;
    public Rectangle(String color, double a, double b) {
        super(color);
        this.a = a;
        this.b = b;
    }

    @Override
    public double area() {
        double area = (this.a * this.b);
        return area;
    }

    @Override
    public double perimeter() {
        double perimeter = (this.a + this.b) * 2;
        return perimeter;
    }

}
