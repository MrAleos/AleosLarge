package day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city = "";

        while (!(city.equals("Stop"))){
            System.out.print("Введите название города: ");
            city = scanner.nextLine();
        switch (city) {
            case "Москва":
            case "Владивосток":
            case "Ростов":
                System.out.println("Россия");
                break;
            case "Рим":
            case "Милан":
            case "Турин":
                System.out.println("Италия");
                break;
            case "Ливерпуль":
            case "Манчестер":
            case "Лондон":
                System.out.println("Англия");
                break;
            case "Берлин":
            case "Мюнхен":
            case "Кельн":
                System.out.println("Германия");
                break;
            default:
                System.out.println("Неизвестная страна");
        }
        }
    }
}

