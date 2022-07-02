public class Pattern2
{
    public static void main(String args[])
    {
        int i, j, n = 15;
        for(i = 5; i > 0; i--)
        {
            for(j = 0; j < i; j++)
            {
                System.out.print(n--+"\t");
            }
            System.out.println();
        }
    }
}
