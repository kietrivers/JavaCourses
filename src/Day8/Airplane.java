package Day8;

class Airplane {

    public Airplane(String manufacturer, int length, int weight, int year) {
        this.manufacturer = manufacturer;
        this.length = length;
        this.weight = weight;
        this.year = year;

    }

    private final String manufacturer;
    private final int year;
    private final int length;
    private final int weight;




    public String toString() {
        return manufacturer + " " + year + " " + length + " " + weight;
    }
}