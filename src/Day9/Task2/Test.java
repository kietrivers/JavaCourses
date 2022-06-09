package Day9.Task2;

public class Test {
    public static void main(String[] args) {
        Figure[] figures = {
                new Triangle("Red", 10, 10, 10),
                new Triangle("Green", 10, 20, 30),
                new Triangle("Red", 10, 20, 15),
                new Rectangle("Red", 5, 10),
                new Rectangle("Orange", 40, 15),
                new Circle("Red", 4),
                new Circle("Red", 10),
                new Circle("Blue", 5)
        };
        calculateRedArea(figures);
        calculateRedPerimeter(figures);

    }
    public static void calculateRedPerimeter(Figure[] figures) {
        double perimeterSum = 0;
        for (int i = 0; i < figures.length; i ++) {
            if (figures[i].getColor().equals("Red")){
                perimeterSum += figures[i].perimeter();
            }
        }
        System.out.println("Sum of Red's figures perimeters = " + perimeterSum);

    }
    public static void calculateRedArea(Figure[] figures) {
        double areaSum = 0;
        for (int i = 0; i < figures.length; i++) {
            if(figures[i].getColor().equals("Red")){
                areaSum += figures[i].area();
            }
        }
        System.out.println("Sum of Red's figures areas = " + areaSum);
    }
}
