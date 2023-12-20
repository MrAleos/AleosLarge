package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int x = scanner.nextInt();
        if (x < 0) {
            System.out.println("Ошибка ввода!");
        } else if (x > 0 && x < 5) {
            System.out.println("Малоэтажный дом.");
        } else if (x > 4 && x < 9) {
            System.out.println("Среднеэтажный дом.");
        } else {
            System.out.println("Многоэтажный дом");
        }
    }
}
