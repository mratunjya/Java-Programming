public class ButterFly {
    public static void main(String[] args) {
        for (int i = 1; i <= 8; i++) {
            for (int j = 8; j >= 1; j--)
                if (i <= 4) {
                    if (j <= i || j > 8 - i)
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                } else {
                    if (j >= i || j <= 8 - i + 1)
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }
            System.out.println();
        }
    }
}

// Output:
/*
*             *
* *         * *
* * *     * * *
* * * * * * * *
* * * * * * * *
* * *     * * *
* *         * *
*             *
 */
