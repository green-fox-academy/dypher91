public class Power {
    public static void main(String[] args) {
        // Given base and n that are both 1 or more, compute recursively (no loops)
        // the value of base to the n power, so powerN(3, 2) is 9 (3 squared).
        System.out.println(compute(3, 2));
        System.out.println(pow(3, 2));
    }

    public static double compute(double number, double exp) {

        return exp == 0 ? 1 : (Math.pow(number, exp));

    }
    public static int pow(int number, int  exp){
       return exp == 0 ? 1 : (number * pow(number,exp-1));
    }

}
