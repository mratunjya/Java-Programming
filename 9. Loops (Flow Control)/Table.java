import java.util.*;

public class Table {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number to print it's table: ");
        int n = in.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + "\t×\t" + i + "\t=\t" + n * i);
        }

        in.close();
    }
}

// Output:
// Enter a number to print it's table: 5
// 5 × 1 = 5
// 5 × 2 = 10
// 5 × 3 = 15
// 5 × 4 = 20
// 5 × 5 = 25
// 5 × 6 = 30
// 5 × 7 = 35
// 5 × 8 = 40
// 5 × 9 = 45
// 5 × 10 = 50