public class IsPallindrome {
    int reverse(int n) {
        int rn = 0;
        while (n > 0) {
            rn = rn * 10 + n % 10;
            n /= 10;
        }
        return rn;
    }

    boolean isPallindrome(int n) {
        return n == reverse(n) ? true : false;
    }

    public static void main(String[] args) {
        IsPallindrome ob = new IsPallindrome();
        System.out.println(ob.isPallindrome(121) ? "Number is Pallindrome" : "Number is not Pallindrome");
    }
}

// Output:
// Number is Pallindrome