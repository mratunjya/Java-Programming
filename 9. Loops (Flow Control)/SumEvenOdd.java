import java.util.*;

public class SumEvenOdd {
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

// Output 1:
// Enter number: 1
// Do you want to enter another number (y for Yes, n for No): y
// Enter number: 2
// Do you want to enter another number (y for Yes, n for No): y
// Enter number: 3
// Do you want to enter another number (y for Yes, n for No): y
// Enter number: 4
// Do you want to enter another number (y for Yes, n for No): y
// Enter number: 5
// Do you want to enter another number (y for Yes, n for No): n
// Sum of Even terms: 6
// Sum of Odd terms: 9

// Output 2:
// Enter number: 1
// Do you want to enter another number (y for Yes, n for No): y
// Enter number: 2
// Do you want to enter another number (y for Yes, n for No): y
// Enter number: 3
// Do you want to enter another number (y for Yes, n for No): y
// Enter number: 4
// Do you want to enter another number (y for Yes, n for No): y
// Enter number: 5
// Do you want to enter another number (y for Yes, n for No): y
// Enter number: 6
// Do you want to enter another number (y for Yes, n for No): y
// Enter number: 7
// Do you want to enter another number (y for Yes, n for No): y
// Enter number: 8
// Do you want to enter another number (y for Yes, n for No): y
// Enter number: 9
// Do you want to enter another number (y for Yes, n for No): y
// Enter number: 10
// Do you want to enter another number (y for Yes, n for No): n
// Sum of Even terms: 30
// Sum of Odd terms: 25