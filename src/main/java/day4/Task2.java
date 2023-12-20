package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] x = new int[100];
        Random random = new Random();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int zero = 0;
        int zeroSumm = 0;

        for (int i = 0; i < x.length; i++) {
            x[i] = random.nextInt(10000);
        }

        for (int number: x) {
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
            if (number % 10 == 0) {
                zero ++;
                zeroSumm += number;
            }
        }
        System.out.println("наибольший элемент массива: " + max +
                "\nнаименьший элемент массива: " + min +
                "\nколичество элементов массива, оканчивающихся на 0: " + zero +
                "\nсумму элементов массива, оканчивающихся на 0: " + zeroSumm);
    }
}
