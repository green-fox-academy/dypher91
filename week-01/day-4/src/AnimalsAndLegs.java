import java.util.Scanner;
public class AnimalsAndLegs {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have
        System.out.println("This program counts legs of the animals (chicken and pig) !");

        Scanner number=new Scanner(System.in);
        System.out.println("Put the number of chickens: ");
        int chick =number.nextInt();
        System.out.println("Put the number of pigs: ");
        int pigs =number.nextInt();

        int legs=((chick*2)+(pigs*4));

        System.out.println("The number of legs is: "+legs);
    }
}
