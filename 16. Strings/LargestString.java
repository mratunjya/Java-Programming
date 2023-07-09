public class LargestString {
    public static void main(String[] args) {

        String str[] = { "DAG", "ABC", "BCA", "CAB" };

        String largest = str[0];

        for (int i = 1; i < str.length; i++) {
            if (largest.compareTo(str[i]) <= 0) {
                largest = str[i];
            }
        }

        System.out.println("Largest String is - " + largest);
    }
}

// Output: Largest String is - DAG