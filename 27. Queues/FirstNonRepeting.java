import java.util.Queue;
import java.util.LinkedList;

public class FirstNonRepeting {
    public static void main(String[] args) {
        String s = "aabccxb";
        int len = s.length();
        int nonRepetingCharIdx = -1;

        Queue<Integer> queue = new LinkedList<>();

        int freq[] = new int[26];

        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            freq[ch - 97]++;
            queue.add(i);

            if (i == 0) {
                nonRepetingCharIdx = 0;
                continue;
            }

            char temp = s.charAt(nonRepetingCharIdx);

            while (freq[temp - 97] != 1 && !queue.isEmpty()) {
                nonRepetingCharIdx = queue.remove();
                temp = s.charAt(nonRepetingCharIdx);
            }
        }

        char ch = s.charAt(nonRepetingCharIdx);

        System.out.println(freq[ch - 97] == 1 ? nonRepetingCharIdx : -1);
    }
}
