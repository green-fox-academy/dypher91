public class factorialWithRecursion {
    public static void main(String[] args) {
        System.out.println(factorialWithRecursion(5));
    }

    public static int factorialWithRecursion(int n){
        if (n ==1){
            return 1;
        }else {
            return n *factorialWithRecursion(n -1);
        }

    }
}
