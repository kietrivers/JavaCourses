package Day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane A1 = new Airplane("Boeing", 10, 15, 2020);
        Airplane A2 = new Airplane("Airbus", 10, 20, 30);
        Airplane.compareLength(A1, A2);
    }
}


