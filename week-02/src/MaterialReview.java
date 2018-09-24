public class MaterialReview {
    static double PI = 3.14;

    public static void main(String[] args) {
        int number = calculateMyNumber();
        System.out.println(PI);
        System.out.println(number);
        System.out.println(square(5));
        for (int i = 0; i < args.length ; i++) {
            System.out.println(args[i]);


        }

    }


    public static int calculateMyNumber(){
        return 5;
    }

    public static int square(int number){
        return number * number;
    }
}
