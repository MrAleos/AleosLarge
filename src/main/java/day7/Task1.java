package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Победа", 2014, 50, 1000);
        Airplane airplane2 = new Airplane("Грустинка", 2013, 40, 9000);

        Airplane.compareAirplanes(airplane1, airplane2);
    }
}