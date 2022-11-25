import java.util.*;

public class Q5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Year: ");
        int n = in.nextInt();

        if (n % 4 == 0)
            if (n % 100 == 0)
                if (n % 400 == 0)
                    System.out.println("It's a leap Year");
                else
                    System.out.println("Not a leap Year");
            else
                System.out.println("It's a leap Year");
        else
            System.out.println("Not a leap Year");

        in.close();
    }
}
