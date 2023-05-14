public class Hanoi {
    public static void towerOfHanoi(int n, String src, String helper, String destination) {
        if (n == 1) {
            System.out.println("Transfer disk " + n + " from " + src + " to " + destination);
            return;
        }

        towerOfHanoi(n - 1, src, destination, helper);
        System.out.println("Transfer disk " + n + " from " + src + " to " + destination);
        towerOfHanoi(n - 1, helper, src, destination);
    }

    public static void main(String[] args) {
        String src = "A", helper = "B", destination = "C";
        towerOfHanoi(4, src, helper, destination);
    }
}
