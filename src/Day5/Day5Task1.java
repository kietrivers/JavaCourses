package Day5;
import java.util.Scanner;

public class Day5Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car car1 = new Car();
        car1.setColor("blue");
        car1.setModel("jaguar");
        car1.setYear(1993);
        System.out.println("Color: " + car1.getColor());
        System.out.println("Model: " + car1.getModel());
        System.out.println("Year of issue: " + car1.getYear());
        car1.Char();

    }
}

class Car {
    private String model;
    private int year;
    private String color;

    public void setModel(String userModel) {
        model = userModel;
    }
    public void setYear(int userYear) {
        year = userYear;
    }
    public void setColor(String userColor) {
        color = userColor;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
    public String getColor() {
        return color;
    }
    public void Char() {
        System.out.println("Color: " + color);
        System.out.println("Model: " + model);
        System.out.println("Year : " + year);

    }

}


