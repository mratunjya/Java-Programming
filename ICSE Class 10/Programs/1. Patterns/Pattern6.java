public class Pattern6
{
    public static void main(String[] args)
    {
        int i, j, k;
        for(i = 1; i <= 9; i+=2)
        {
            for(j = i; j <= 9; j+=2)
            {
                System.out.print(j+" ");
            }
            for(k = 1; k < i; k+=2)
            {
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}