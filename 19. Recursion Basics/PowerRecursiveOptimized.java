public class PowerRecursiveOptimized {
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static long power(int m, int n) {
        if (n == 0)
            return 1;

        if (n == 1)
            return m;

        long halfPow = power(m, n / 2);
        long pow = halfPow * halfPow;

        return isEven(n) ? pow : m * pow;
    }

    public static void main(String[] args) {
        System.out.println(power(2, 10));
    }
}
