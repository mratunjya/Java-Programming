public class DuplicateString {
    public static String duplicateString(String str, int i, boolean map[]) {
        if (i >= str.length())
            return "";

        if (map[str.charAt(i) - 'a'])
            return duplicateString(str, i + 1, map);
        else {
            map[str.charAt(i) - 'a'] = true;
            return str.charAt(i) + duplicateString(str, i + 1, map);
        }
    }

    public static void main(String[] args) {
        boolean map[] = new boolean[26];
        System.out.println(duplicateString("mratunjyashankhdhar", 0, map));
    }
}
