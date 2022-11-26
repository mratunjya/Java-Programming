public class Q5 {
    int SumOfDigits(int n) {
        int Sum = 0;

        while (n > 0) {
            Sum = Sum + n % 10;
            n /= 10;
        }

        return Sum;
    }

    public static void main(String[] args) {
        Q5 ob = new Q5();
        int n = 12345;
        System.out.println("Sum of Digits of " + n + " is " + ob.SumOfDigits(n));
    }
}
