public class ContigousSubstrings {
    public static int printAllContigousSubstrings(String str, int start, int end, int len) {
        if (len == 0) {
            return 0;
        }

        System.out.println(str.substring(start, end + 1));

        if (len == 1) {
            return 1;
        }

        int result = printAllContigousSubstrings(str, start, end - 1, len - 1)
                + printAllContigousSubstrings(str, start + 1, end, len - 1)
                - printAllContigousSubstrings(str, start + 1, end - 1, len - 2);

        if (str.charAt(start) == str.charAt(end))
            ++result;

        return result;
    }

    public static void main(String[] args) {
        String str = "abcd";
        int start = 0;
        int len = str.length();
        int end = len - 1;
        int total = printAllContigousSubstrings(str, start, end, len);

        System.out.println(total);
    }
}