public class AllPernutations {
    public static void allPernutations(String str, String permuted) {
        if (str.length() == 0) {
            System.out.println(permuted);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            String str1 = str.substring(0, i) + str.substring(i + 1, str.length());

            allPernutations(str1, permuted + curr);
        }
    }

    public static void main(String[] args) {
        String str = "abc";

        allPernutations(str, "");
    }
}
