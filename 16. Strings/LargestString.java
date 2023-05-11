public class LargestString {
    public static void main(String[] args) {

        String str[] = { "ABC", "BCA", "CAB" };

        String largest = "";

        for (int i = 1; i < str.length; i++) {
            if (str[i - 1].compareTo(str[i]) <= 0) {
                largest = str[i];
            } else {
                largest = str[i - 1];
            }
        }

        System.out.println("Largest String is - " + largest);
    }
}
