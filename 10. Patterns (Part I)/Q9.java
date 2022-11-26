public class Q9 {
    public static void main(String[] args) {
        int c = 0;
        for (int i = 1; i <= 7; i += 2) {
            for (int j = 1; j <= 7 / 2 - c; j++)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            ++c;
            System.out.println();
        }
        --c;
        for (int i = 7; i >= 1; i -= 2) {
            for (int j = 7 / 2 - c; j >= 1; j--)
                System.out.print(" ");
            for (int j = i; j >= 1; j--)
                System.out.print("*");
            --c;
            System.out.println();
        }
    }
}
