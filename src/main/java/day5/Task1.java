package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("Vesta");
        car.setColor("White");
        car.setCreationData(2018);

        System.out.println("Model: " + car.getModel() +
                "\nColor: " + car.getColor() +
                "\nCreation data: " + car.getCreationData());
    }
}
