package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Чернобыль", 2020, 30, 200);
        airplane.setLength(31);
        airplane.setYear(2021);
        airplane.fillUp(50);
        airplane.fillUp(40);
        airplane.info();
    }
}
