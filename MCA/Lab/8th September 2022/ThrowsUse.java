import java.io.*;
public class ThrowsUse {
    public static void main(String[] args)throws IOException {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        System.out.println("Enter the first number: ");
        int a = Integer.parseInt(in.readLine());
        System.out.println("Enter the second number: ");
        int b = Integer.parseInt(in.readLine());

        int c = a/b;
        System.out.println("The result is: "+c);
    }
}
