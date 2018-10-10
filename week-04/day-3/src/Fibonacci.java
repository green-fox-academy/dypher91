public class Fibonacci {
    int num;

    public Fibonacci(int num) {
        this.num = num;
    }

    public Fibonacci(){

    }

    public static int FibonacciCount(int num) {
        if (num <= 1) {
            return num;
        } else {
            return FibonacciCount(num - 1) + FibonacciCount(num - 2);
        }


    }
}


