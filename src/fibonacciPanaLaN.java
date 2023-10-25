public class fibonacciPanaLaN {
    public static void main(String[] args) {
        int n = 100;

        long first = 0;
        long second = 1;

        System.out.println("Șirul lui Fibonacci până la " + n + " este:");

        while (first <= n) {
            System.out.print(first + " ");
            long sum = first + second;
            first = second;
            second = sum;
        }
    }
}