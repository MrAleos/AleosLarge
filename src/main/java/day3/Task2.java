package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = 1;
        double y = 1;

        while (true) {
            System.out.print("Введите первое число: ");
            x = scanner.nextDouble();
            System.out.print("Введите второе число: ");
            y = scanner.nextDouble();

            if (y == 0) {
                break;
            }

            double z = x / y;
            System.out.println(z);
        }
    }
}
