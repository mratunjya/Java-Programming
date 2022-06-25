public class Pattern3
{
    public static void main(String[] args)
    {
        int i, j;
        
        for(i = 1; i <= 5; i++)
        {
            for(j = i; j >= 1; j--)
            {
                System.out.print(j+"\t");
            }
            System.out.println();
        }
    }
}