package Day6;

public class Task2 {
    public static void main(String[] args){
    Airplane airplane1 = new Airplane("Airbus", 1000, 300, 1999);
    airplane1.info();
    airplane1.setLength(5000);
    airplane1.setYear(2020);
    airplane1.setManufacturer("Boeing");
    airplane1.fillUp(13);
    airplane1.info();
    airplane1.fillUp(15);
    airplane1.info();


    }
}

class Airplane {

    public Airplane(String manufacturer, int length, int weight, int year) {
        this.fuel = 0;
        this.manufacturer = manufacturer;
        this.length = length;
        this.weight = weight;
        this.year = year;

    }
    private String manufacturer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }


    public void setWeight(int weight) {
        this.weight = weight;
    }


    public void setLength(int length) {
        this.length = length;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public int fillUp(int fuel){
        this.fuel += fuel;
        return this.fuel;
    }
    public void info(){
        System.out.println(year + " " + manufacturer + " " + weight + " " +  length + " " + fuel );
    }
}