import java.util.*;

public class Q4 {
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
