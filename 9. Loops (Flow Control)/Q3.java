import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        int fact = 1;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number to find it's factorial: ");
        int n = in.nextInt();

        for (int i = n; i > 0; i--) {
            fact = fact * i;
        }

        System.out.println("Factorial of " + n + " is " + fact);

        in.close();
    }
}
