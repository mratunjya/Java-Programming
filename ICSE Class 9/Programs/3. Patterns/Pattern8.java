public class Pattern8
{
    public static void main(String[] args)
    {
        int i, j;
        
        for(i = 9; i >= 1; i-=2)
        {
            for(j = i; j <= 9; j+=2)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}