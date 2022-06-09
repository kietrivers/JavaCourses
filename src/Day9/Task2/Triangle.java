package Day9.Task2;

public class Triangle extends Figure {
    private double a;
    private double b;
    private double c;
    public Triangle(String color, double a, double b, double c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        double p = (a + b + c)/2;
        double area = Math.pow(p*(p-a)*(p-b)*(p-c), 0.5);
        return area;
    }

    @Override
    public double perimeter() {
        double perimeter = a + b + c;
        return perimeter;
    }
}
