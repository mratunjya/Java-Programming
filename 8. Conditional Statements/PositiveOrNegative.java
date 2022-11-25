import java.util.*;

public class PositiveOrNegative {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);

      System.out.print("Enter the number to check if it's Positive, Negative or Zero: ");
      int n = in.nextInt();

      if (n > 0)
         System.out.println(n + " is positive");
      else if (n < 0)
         System.out.println(n + " is negative");
      else
         System.out.println("It is zero");

      in.close();
   }
}

// Output 1:
// Enter the number to check if it's Positive or Negative: 5
// 5 is positive

// Output 2:
// Enter the number to check if it's Positive or Negative: -5
// -5 is negative

// Output 3:
// Enter the number to check if it's Positive or Negative: 0
// It is zero