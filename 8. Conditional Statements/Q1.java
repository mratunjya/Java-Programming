import java.util.*;

public class Q1 {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);

      System.out.print("Enter the number to check if it's Positive or Negative: ");
      int n = in.nextInt();

      if (n > 0)
         System.out.println(n + " is positive");
      else
         System.out.println(n + " is negative");

      in.close();
   }
}
