package Day7;

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
    public static void compareLength(Airplane A1, Airplane A2) {
        if (A1.length > A2.length) {
            System.out.println("1-st Airplane's length more then second.");
        }
        else if (A1.length < A2.length) {
            System.out.println("Second Airplane's length more than 1-st. ");
        }
        else {
            System.out.println("Their lengths are equal.");
        }
    }
}