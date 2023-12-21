package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();
        int s = a + 1;

        while (s < b){
            if (s % 5 == 0 && s % 10 != 0) {
                System.out.println(s);
            }
            s++;
        }
    }
}
