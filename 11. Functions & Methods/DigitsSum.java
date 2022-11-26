public class DigitsSum {
    int sumOfDigits(int n) {
        int Sum = 0;

        while (n > 0) {
            Sum = Sum + n % 10;
            n /= 10;
        }

        return Sum;
    }

    public static void main(String[] args) {
        DigitsSum ob = new DigitsSum();
        int n = 12345;
        System.out.println("Sum of Digits of " + n + " is " + ob.sumOfDigits(n));
    }
}

// Output:
// Sum of Digits of 12345 is 15