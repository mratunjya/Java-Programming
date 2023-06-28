public class NumberPyramid {
    public static void main(String[] args) {
        int c = 1;
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j < i; j++)
                System.out.print(" ");
            for (int j = 1; j <= c; j++)
                System.out.print(c + " ");
            ++c;
            System.out.println();
        }
    }
}

// Output:
//     1
//    2 2
//   3 3 3
//  4 4 4 4
// 5 5 5 5 5