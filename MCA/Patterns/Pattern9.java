// Palindromic Number Pattern

public class Pattern9
{
    public static void main(String args[])
    {
        for(int i = 1; i <= 5; i++)
        {
            for(int j = i; j <= 5 - 1; j++)
            {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++)
            {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}