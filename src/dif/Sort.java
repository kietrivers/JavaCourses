package dif;
import java.util.Random;

public class Sort {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
        }
        int temp;
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < (array.length - 1); i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    isSorted = false;
                }
            }
        }
        System.out.println();
        for (int k = 0; k < array.length; k++) {
            System.out.print(array[k] + " ");

        }
    }
}
