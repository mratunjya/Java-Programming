public class Reverse {
    public static void main(String args[]) {
        int n = 123987, tn, rn = 0;

        /**
         * n: Original Number
         * tn: Temporary Number
         * rn: Reverse Number
         */

        tn = n;
        while (tn != 0) {
            rn = rn * 10 + tn % 10;
            tn = tn / 10;
        }
        System.out.println("Reverse of " + n + " is " + rn);
    }
}