package Cloneable;

public class Main {

    public static void main(String[] args) {
        Student john = new Student("John", 20, "Male", "BME");
        Student clone = john.clone();

        clone.introduce();



    }
}
