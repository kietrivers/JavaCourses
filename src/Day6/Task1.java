package Day6;

public class Task1 {
    public static void main(String[] args) {
        Moto moto1 = new Moto("blue", "huyndai", 1998);
        Car car1 = new Car();
        car1.setColor("black");
        car1.setModel("bmw");
        car1.setYear(2002);

        car1.info();
        moto1.info();
        System.out.println(moto1.yearDifference(2014));
        System.out.println(car1.yearDifference(2000));

    }
}

