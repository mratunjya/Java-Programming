import java.util.*;

public class LeapYear {
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

// Output 1:
// Enter Year: 2020
// It's a leap Year

// Output 2:
// Enter Year: 2021
// Not a leap Year

// Output 3:
// Enter Year: 2000
// It's a leap Year

// Output 4:
// Enter Year: 1900
// Not a leap Year

// Output 5:
// Enter Year: 2004
// It's a leap Year