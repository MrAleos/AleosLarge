package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = 1;
        double y = 1;

        for (int i = 0; i < 5; i++){
            System.out.print("Введите первое число: ");
            x = scanner.nextDouble();
            System.out.print("Введите второе число: ");
            y = scanner.nextDouble();
            if (y == 0){
                System.out.println("Деление на 0");
                    continue;
            }
            double z = x / y;
            System.out.println(z);
        }
    }
}
