public class Pattern5
{
    public static void main(String[] args)
    {
        int i, j;
        for(i = 1; i <= 5; i++)
        {
            for(j = 1; j <= 5; j++)
            {
                if(j < i)
                {
                    System.out.print(i+" ");
                }
                else
                {
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
    }
}
