import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int c = 0, evenSum = 0, oddSum = 0;
        char choice;
        boolean flag = true;

        do {
            System.out.print("Enter number: ");
            if (++c % 2 == 0)
                evenSum = evenSum + in.nextInt();
            else
                oddSum = oddSum + in.nextInt();

            System.out.print("Do you want to enter another number (y for Yes, n for No): ");
            choice = in.next().charAt(0);

            if (choice == 'n')
                flag = false;
        } while (flag == true);

        System.out.println("Sum of Even terms: " + evenSum);
        System.out.println("Sum of Odd terms: " + oddSum);

        in.close();
    }
}
