// Matrix Addition

import java.io.*;
public class MatrixAddition
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        int m, n;

        System.out.print("Enter Number of Rows in a Matrix: ");
        m = Integer.parseInt(in.readLine());

        System.out.print("Enter Number of Columns in a Matrix: ");
        n = Integer.parseInt(in.readLine());

        int A[][] = new int[m][n];
        int B[][] = new int[m][n];
        int C[][] = new int[m][n];

        System.out.println("Enter elements in matrix A in a row major order ....");

        for(int i = 0; i < m; i++)
            for(int j = 0; j < n; j++)
                A[i][j] = Integer.parseInt(in.readLine());

        System.out.println("Enter elements in matrix B in a row major order ....");

        for(int i = 0; i < m; i++)
            for(int j = 0; j < n; j++)
                B[i][j] = Integer.parseInt(in.readLine());

        for(int i = 0; i < m; i++)
            for(int j = 0; j < n; j++)
                C[i][j] = A[i][j] + B[i][j];

        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
                System.out.print(C[i][j] + "\t");
            System.out.println();
        }
    }
}
