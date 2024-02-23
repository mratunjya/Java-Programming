public class AllSubstrings {
    public static void allSubstrings(String str, int si, int ei, String subset) {
        if (si > ei) {
            System.out.println(subset == "" ? "\"\"" : subset);
            return;
        }

        allSubstrings(str, si + 1, ei, subset + str.charAt(si));
        allSubstrings(str, si + 1, ei, subset);
    }

    public static void main(String[] args) {
        String str = "abc";

        allSubstrings(str, 0, str.length() - 1, "");
    }
}