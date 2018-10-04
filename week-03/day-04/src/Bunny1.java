public class Bunny1 {
    public static void main(String[] args) {
        // We have a number of bunnies and each bunny has two big floppy ears.
        // We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).
        int bunnies = 100;
        System.out.println("Total number of ears is: "+computeEars(bunnies));
    }

    public static int computeEars(int number){

        return number == 0 ? 0 : 2 + computeEars(number - 1);
    }
}
