package day4;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int[] x = new int[scanner.nextInt()];
        Random random = new Random();
        int numberOne = 0;
        int numberThanEight = 0;
        int even = 0;
        int odd = 0;
        int summ = 0;

        for (int i = 0; i < x.length; i++) {
            x[i] = random.nextInt(11);
            summ += x [i];
            if (x[i] > 8 ) {
                numberThanEight++;
            }
            if (x[i] == 1) {
                numberOne++;
            }
            if (x[i] % 2 == 0) {
                even++;
            }
            else {
                odd++;
            }
        }
        System.out.print("Числа массива: ");
        for (int number: x) {
            System.out.print(number);
            System.out.print(" ");
        }

        System.out.println("\nДлина массива: " + x.length +
        "\nКоличество чисел больше 8: " + numberThanEight +
        "\nКоличество чисел равных 1: " + numberOne +
        "\nКоличество четных чисел: " + even +
        "\nКоличество нечетных чисел: " + odd +
        "\nСумма всех элементов массива: " + summ);
    }
}
