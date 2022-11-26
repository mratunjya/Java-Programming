public class Q11 {
    public static void main(String[] args) {
        int c = 1;
        for (int i = 4; i >= 0; i--) {
            for (int j = 1; j <= i; j++)
                System.out.print(" ");
            for (int j = 5; j >= 1; j--)
                if (j <= c)
                    System.out.print(j);
            for (int j = 2; j <= c; j++)
                System.out.print(j);
            ++c;
            System.out.println();
        }
    }
}
