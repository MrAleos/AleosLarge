package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setCreationData(2020);
        Motorbike motorbike = new Motorbike("Yamaha", "Black", 2013);

        car.info();
        System.out.println(car.yearDifference(2019));

        motorbike.info();
        System.out.println(motorbike.yearDifference(2019));

    }
}
