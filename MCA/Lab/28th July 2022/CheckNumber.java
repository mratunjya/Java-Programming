public class CheckNumber {
    public static void main(String args[]) {
        int n = 15;

        /**
         * Check the number is Negative, Positive or Zero using if else-if else
         */

        System.out.println("Checking if the entered number is Negative, Positive or Zero using if else-if else");
        if (n > 0)
            System.out.println(n + " is Positive");
        else if (n < 0)
            System.out.println(n + " is Negative");
        else
            System.out.println("Entered Number is Zero");

        /**
         * Check the number is Negative, Positive or Zero using if only
         */

        System.out.println("Checking if the entered number is Negative, Positive or Zero using if only");
        if (n > 0)
            System.out.println(n + " is Positive");
        if (n < 0)
            System.out.println(n + " is Negative");
        if (n == 0)
            System.out.println("Entered Number is Zero");
    }
}
