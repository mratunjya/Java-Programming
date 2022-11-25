import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n;

        System.out.print("Enter a number (1 - 7) to get the day of the week: ");
        n = in.nextInt();

        switch (n) {
            case 1:
                System.out.println("It's Monday");
                break;
            case 2:
                System.out.println("It's Tuesday");
                break;
            case 3:
                System.out.println("It's Wednesday");
                break;
            case 4:
                System.out.println("It's Thursday");
                break;
            case 5:
                System.out.println("It's Friday");
                break;
            case 6:
                System.out.println("It's Saturday");
                break;
            case 7:
                System.out.println("It's Sunday");
                break;
            default:
                System.out.println("There are days from 1 to 7 only");
                break;
        }

        in.close();
    }
}
