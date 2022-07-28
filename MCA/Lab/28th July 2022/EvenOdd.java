import java.util.Scanner;

public class EvenOdd {
    public static void main(String args[]) {
        int n = 0;
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a number to check if it's even or odd: ");
            n = sc.nextInt();
        } finally {
            sc.close();
        }

        if (n > 0) {
            if (n % 2 == 0)
                System.out.println(n + " is Even");
            else
                System.out.println(n + " is Odd");
        } else
            System.out.println(n + " is either 0 or Negative that's why we can't check for Even or Odd");
    }
}