package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike("Yamaha", "Black", 2013);

        System.out.println("Model: " + motorbike.getModel() +
                "\nColor: " + motorbike.getColor() +
                "\nCreation data: " + motorbike.getCreationData());
    }
}
