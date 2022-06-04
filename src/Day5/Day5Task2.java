package Day5;

public class Day5Task2 {
    public static void main(String[] args) {
    Moto moto1 = new Moto("Black", "Yamaha", 1999);
    System.out.println(moto1.getColor());
    System.out.println(moto1.getModel());
    System.out.println(moto1.getYear());

    }
}


class Moto {
    private String color;
    private String model;
    private int year;
    public Moto(String color, String model, int year){
        this.color = color;
        this.model = model;
        this.year = year;
    }
    public String getColor() { return color; }

    public String getModel() { return model; }

    public int getYear()  { return year; }


}
