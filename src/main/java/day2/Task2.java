package day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();

        if (a >= b) {
            System.out.println("Некорректный ввод");
        }

        for (int i = a; i < b; i++) {
            a++;
            if (a % 5 == 0 && a % 10 != 0) {
                System.out.println(a);
            }
        }
    }
}
