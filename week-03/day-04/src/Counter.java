public class Counter {
    public static void main(String[] args) {
        // Write a recursive function that takes one parameter: n and counts down from n.
        System.out.println(countDown(5));
    }


    public static int countDown(int n){
       if (n == 1) {
           return 1;
       }else{
           return n + countDown(n-1);

       }
    }
}
