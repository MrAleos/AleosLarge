package day6;

public class Car {
    private String model;
    private String color;
    private int creationData;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCreationData() {
        return creationData;
    }

    public void setCreationData(int creationData) {
        this.creationData = creationData;
    }

    public void info () {
        System.out.println("Это автомобиль.");
    }

    public int yearDifference(int inputYear) {
        return Math.abs(inputYear - creationData);
    }
}
