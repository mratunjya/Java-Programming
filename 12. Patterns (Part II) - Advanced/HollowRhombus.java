public class HollowRhombus {
    public static void main(String[] args) {
        for (int i = 4; i >= 0; i--) {
            for (int j = 1; j <= i; j++)
                System.out.print("  ");
            for (int j = 1; j <= 5; j++)
                if (j == 1 || j == 5 || i == 4 || i == 0)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            System.out.println();
        }
    }
}

// Output:
/*
        * * * * *
      *       *
    *       *
  *       *
* * * * *
*/