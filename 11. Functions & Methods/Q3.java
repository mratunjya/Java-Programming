public class Q3 {
    int Reverse(int n) {
        int rn = 0;
        while (n > 0) {
            rn = rn * 10 + n % 10;
            n /= 10;
        }
        return rn;
    }

    boolean isPallindrome(int n) {
        return n == Reverse(n) ? true : false;
    }

    public static void main(String[] args) {
        Q3 ob = new Q3();
        System.out.println(ob.isPallindrome(121) ? "Number is Pallindrome" : "Number is not Pallindrome");
    }
}
