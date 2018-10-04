public class NumberAdder {
    public static void main(String[] args) {
        // Write a recursive function that takes one parameter: n and adds numbers from 1 to n.

       numberAdd(20);
    }

    public static void numberAdd(int n) {
        if (n > 1) {
            numberAdd(n - 1);
        }
        System.out.print(n+" ");
        }
    }


