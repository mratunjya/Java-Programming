public class Pattern1
{
    public static void main(String[] args)
    {
        int i, j, k, n = 6;
        for(i = 1; i <= 4; i++)
        {
            for(k = 1; k <= n; k++)
            {
                System.out.print(" ");
            }
            n-=2;
            for(j = 1; j <= i; j++)
            {
                System.out.print(j+" ");
            }
            for(k = i - 1; k >= 1; k--)
            {
                System.out.print(k+" ");
            }
            System.out.println();
        }
        n = 2;
        for(i = 3; i >= 1; i--)
        {
            for(k = 1; k <= n; k++)
            {
                System.out.print(" ");
            }
            n+=2;
            for(j = 1; j <= i; j++)
            {
                System.out.print(j+" ");
            }
            for(k = i - 1; k >= 1; k--)
            {
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}