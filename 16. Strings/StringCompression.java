public class StringCompression {
    public static void main(String[] args) {
        String str = "aaabbccccddeab";
        StringBuilder sb = new StringBuilder("");
        int start = 0, end = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                ++end;
            } else {
                sb.append(str.charAt(i));
                int len = end - start + 1;
                if (len > 1)
                    sb.append(end - start + 1);
                start = ++end;
            }
        }

        sb.append(str.charAt(str.length() - 1));
        int len = end - start + 1;
        if (len > 1)
            sb.append(end - start + 1);

        System.out.println(sb.toString());
    }
}
