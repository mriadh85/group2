package ClassPractice1;

public class FibonacciNumbers {
    /*static int fib(int n){
        if (n <= 1)
            return n;
        return fib(n-1)+ fib(n-2);
    }

    public static void main(String[] args) {
        int n = 80;
        System.out.println(fib(n));
    }*/

    public static void main(String[] args) {
        int next = 0;
        int prev = 1;
        for (int i = 0; i < 10; i++){
            System.out.println(next);
            next = next + prev;
            prev = next - prev;
        }
    }
}
