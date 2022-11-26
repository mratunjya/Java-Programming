public class Q7 {
    public static void main(String[] args) {
        for (int i = 4; i >= 0; i--) {
            for (int j = 1; j <= i; j++)
                System.out.print("  ");
            for (int j = 1; j <= 5; j++)
                System.out.print("* ");
            System.out.println();
        }
    }
}
