package Day6;

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
    public void Characteristics() {
        System.out.println("Color: " + color);
        System.out.println("Model: " + model);
        System.out.println("Year : " + year);

    }
    public void info() {
        System.out.println("This is car.");
    }

    public int yearDifference(int inputYear) {
        return Math.abs(inputYear - year);
    }

}


