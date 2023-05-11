import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int len = str.length();
        boolean flag = true;

        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - 1 - i)) {
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.println("Input String is Palindrome");
        } else {
            System.out.println("Input String is Not Palindrome");
        }

        in.close();
    }
}
