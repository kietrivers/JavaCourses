package Day6;


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

    public void info() {
        System.out.println("This is motorcycle.");
    }
    public int yearDifference(int inputYear) {
        return Math.abs(inputYear - year);
    }
}
