package Day4;

import java.util.Random;
public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[100];
        int max = 0;
        int sum;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
        }
        for (int j = 0; j < array.length - 2; j++) {
            sum =  array[j] + array[j + 1] + array[j + 2];
            if (sum > max) {
                max = sum;
                index = j;


            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print (array[i] + " ");
        }
        System.out.println(max);
        System.out.println(index + 1);
    }
}

