// Rhombus Pattern

public class Pattern7
{
    public static void main(String args[])
    {
        for(int i = 1; i <= 5; i++)
        {
            int countSpace = 5 - i;
            for(int j = 1; j <= countSpace; j++)
            {
                System.out.print("  ");
            }
            for(int j = i; j <= 9 - countSpace; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}