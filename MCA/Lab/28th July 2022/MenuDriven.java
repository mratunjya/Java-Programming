import java.io.*;

public class MenuDriven {
    public static void main(String args[]) throws IOException {
        int n, n1, n2, c = 0;

        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        /* Getting Numbers from User */

        System.out.print("Enter n1: ");
        n1 = Integer.parseInt(in.readLine());
        System.out.print("Enter n2: ");
        n2 = Integer.parseInt(in.readLine());

        System.out.println("Greetings user, Which operation would you like to perform?");
        System.out.println("Select from the list given below -");
        System.out.println("1. For Addition");
        System.out.println("2. For Subtraction");
        System.out.println("3. For Multiplication");
        System.out.println("4. For Division");
        System.out.print("Your Input: ");

        n = Integer.parseInt(in.readLine());

        switch (n) {
            case 1:
                c = n1 + n2;
                break;
            case 2:
                c = n1 - n2;
                break;
            case 3:
                c = n1 * n2;
                break;
            case 4:
                c = n1 / n2;
                break;
            default:
                System.out.println("See You Again!");
        }
        if (n >= 1 && n <= 4)
            System.out.println("After performing the selected operation for " + n1 + " and " + n2 + " output is " + c);
    }
}
