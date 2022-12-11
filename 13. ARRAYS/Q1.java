public class Q1 {
    public static void main(String[] args) {
        int n[] = { 1, 2, 3, 1 };
        boolean flag = false;

        for (int i = 0; i < n.length - 1; i++) {
            for (int j = i + 1; j < n.length; j++) {
                if (n[i] == n[j]) {
                    flag = true;
                }
            }
        }

        System.out.println("Is array have repeated elements? " + flag);
    }
}
