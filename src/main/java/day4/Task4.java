package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int [] array = new int[100];
        Random random = new Random();
        int summ = 0;
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
        }

        for (int i = 0; i < array.length-2; i++) {
            int a = 0;
            for (int j = i; j < i + 3; j++) {
                a += array[j];
            }

            if (a > summ) {
                summ = a;
                index = i;
            }
        }

        System.out.println("Сумма: " + summ +
                "\nИндекс: " + index);
    }
}
