
import java.util.Scanner;
public class MatrixMultiplication
{
    public static void main(String args[])
    {
        // Take two matrices A and B as input and multiply them and print the result

        int m, n, p;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter Number of Rows in a Matrix A: ");
        m = in.nextInt();

        System.out.print("Enter Number of Columns in a Matrix A: ");
        n = in.nextInt();

        System.out.print("Enter Number of Rows in a Matrix B: ");
        p = in.nextInt();

        int A[][] = new int[m][n];
        int B[][] = new int[n][p];
        int C[][] = new int[m][p];

        // Check if Matrix A and Matrix B are compatible for multiplication
        if(n != p)
        {
            System.out.println("Matrix A and Matrix B are not compatible for multiplication");
            in.close();
            return;
        }

        System.out.println("Enter elements in matrix A in a row major order ....");
        for(int i = 0; i < m; i++)
            for(int j = 0; j < n; j++)
                A[i][j] = in.nextInt();

        System.out.println("Enter elements in matrix B in a row major order ....");
        for(int i = 0; i < n; i++)
            for(int j = 0; j < p; j++)
                B[i][j] = in.nextInt();

        in.close();

        for(int i = 0; i < m; i++)
            for(int j = 0; j < p; j++)
                C[i][j] = 0;

        for(int i = 0; i < m; i++)
            for(int j = 0; j < p; j++)
                for(int k = 0; k < n; k++)
                    C[i][j] += A[i][k] * B[k][j];

        System.out.println("Matrix A: ");
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
                System.out.print(A[i][j] + "\t");
            System.out.println();
        }

        System.out.println("Matrix B: ");
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < p; j++)
                System.out.print(B[i][j] + "\t");
            System.out.println();
        }

        System.out.println("Matrix C: ");
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < p; j++)
                System.out.print(C[i][j] + "\t");
            System.out.println();
        }
    }
}
