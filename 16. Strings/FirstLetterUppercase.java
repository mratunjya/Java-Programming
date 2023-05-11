public class FirstLetterUppercase {
    public static void main(String[] args) {
        String str = "hi, i am mratunjya shankhdhar";
        StringBuilder sb = new StringBuilder(" ");
        sb.append(str);

        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == ' ') {
                sb.replace(i + 1, i + 2, Character.toString(Character.toUpperCase(sb.charAt(i + 1))));
            }
        }

        sb.replace(0, 1, "");

        System.out.println(sb.toString());
    }
}
