public class Pattern4
{
    public static void main (String[] args)
    {
        int i, j;
        
        for(i = 1; i <= 5; i++)
        {
            for(j = 5; j >= i; j--)
            {
                System.out.print(j+"\t");
            }
            System.out.println();
        }
    }
}