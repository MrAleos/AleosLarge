package day4;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int [][] array = new int[12][8];
        Random random = new Random();
        int summ = 0;
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(50);
            }
        }

        for (int i = 0; i < array.length; i++) {
            int tmp = 0;
            for(int j = 0; j < array[i].length; j++) {
                tmp+=array[i][j];
            }
            if (tmp >= summ) {
                summ = tmp;
                index = i;
            }
        }
        System.out.println(index);
    }
}
