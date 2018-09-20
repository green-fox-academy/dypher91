import java.util.Scanner;
public class Cuboid {
    public static void main(String args[])
    {

        Scanner s= new Scanner(System.in);
        System.out.println("Enter the length of Cubiod:");
        double l=s.nextDouble();
        System.out.println("Enter the breadth of Cubiod:");
        double b=s.nextDouble();
        System.out.println("Enter height of Cubiod:");
        double h=s.nextDouble();



        double  volume= l*b*h;
        double surface=(2*((l*b)+(l*h)+(b*h)));

        System.out.println("Volume of Cuboid is: " +volume);
        System.out.println("Volume of Cuboid is: " +surface);



    }
}

