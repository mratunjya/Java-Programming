public class Pattern11
{
   public static void main(String[] args)
   {
       int i, j;
       
       for(i = 9; i >= 1; i-=2)
       {
           for(j = 9; j >= i; j-=2)
           {
               System.out.print(j+" ");
           }
           System.out.println();
       }
   }
}