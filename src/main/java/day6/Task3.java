package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Коваленко Андрей Михайлович", "литература");
        Student student = new Student("Максименко Олег Андреевич");

        teacher.evaluate(student);
    }
}
