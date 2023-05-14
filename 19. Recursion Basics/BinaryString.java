public class BinaryString {
    public static void printBinaryString(int n, String str, int i) {
        if (i > n - 1)
            System.out.println(str);
        else {
            printBinaryString(n, str + "0", i + 1);

            if (str.length() > 0) {
                if (str.charAt(i - 1) != '1')
                    printBinaryString(n, str + "1", i + 1);
            } else
                printBinaryString(n, str + "1", i + 1);
        }
    }

    public static void main(String[] args) {
        printBinaryString(3, "", 0);
    }
}
