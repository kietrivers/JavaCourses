package Day8;

public class Task1 {
    public static void main(String[] args) {
        StringBuilder string1 = new StringBuilder("0");
        long startTime1 = System.currentTimeMillis();
        for (int i = 1; i <= 20000; i++) {
            string1.append(i).append(" ");
        }
        System.out.println(string1);
        long stopTime1 = System.currentTimeMillis();
        System.out.println("Duration of work with using append method = " + (stopTime1 - startTime1) + " millis");

        String string2 = "0";
        long startTime2 = System.currentTimeMillis();
        for (int j = 1; j <= 20000; j++) {
            string2 += j + " ";
        }
        System.out.println(string2);
        long stopTime2 = System.currentTimeMillis();
        System.out.println("Duration of work without using append method = " + (stopTime2 - startTime2) + " millis");



    }
}
